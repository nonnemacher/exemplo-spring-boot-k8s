package dev.thehouseof.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
@RequestMapping("/products")
interface ProductController {

    @GetMapping
    Flux<Product> get();

}
