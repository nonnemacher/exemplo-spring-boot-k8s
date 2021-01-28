package dev.thehouseof.springboot.api;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.stream.LongStream;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
@Service
class ProductServiceImpl implements ProductService {
    @Override
    public Flux<Product> get() {
        return Flux.fromStream(
            LongStream.range(1, 100)
                .boxed()
                .map(l -> Product
                    .builder()
                    .id(l)
                    .name(RandomStringUtils.randomAlphanumeric(20))
                    .build()
                )
        );
    }
}
