package com.gray.WebFluxApp2.Services;

import com.gray.WebFluxApp2.dto.ProductsDto;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 10:10 PM
 * WebFluxApp2
 */
public interface ProductService {
    public Flux<ProductsDto> getAllProducts();
    public Mono<ProductsDto> addProduct(Mono<ProductsDto> productsDtoMono);
    public Mono<ProductsDto> updateProduct(Mono<ProductsDto> productsDtoMono);
    public Mono<ProductsDto> getProductById(String id);
    public void deleteProduct(String id);
}
