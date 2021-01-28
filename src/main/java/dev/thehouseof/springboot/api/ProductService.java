package dev.thehouseof.springboot.api;

import reactor.core.publisher.Flux;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
interface ProductService {

    Flux<Product> get();

}
