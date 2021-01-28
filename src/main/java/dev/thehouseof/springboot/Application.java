package dev.thehouseof.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
            .bannerMode(Banner.Mode.OFF)
            .build()
            .run(args);
	}

}
