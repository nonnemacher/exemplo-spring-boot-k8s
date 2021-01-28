package dev.thehouseof.springboot.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
@RestController
@RequiredArgsConstructor
class ProductControllerImpl implements ProductController {

    final ProductService productService;

    @Override
    public Flux<Product> get() {
        return this.productService.get();
    }
}
