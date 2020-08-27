package dev.thehouseof.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class Application {

    @Value("${application.version}")
    private String version;

    @GetMapping("/info")
    public Mono<Map> getVersion() {
        final Map data = new HashMap();
        data.put("version", version);
        return Mono.just(data);
    }

	public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
            .bannerMode(Banner.Mode.OFF)
            .build()
            .run(args);
	}

}
