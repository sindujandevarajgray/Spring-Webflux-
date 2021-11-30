package com.gray.WebFluxApp2.Services.impl;

import com.gray.WebFluxApp2.Repository.ProductRepository;
import com.gray.WebFluxApp2.Services.ProductService;
import com.gray.WebFluxApp2.Utils.EntityDTOConvertor;
import com.gray.WebFluxApp2.dto.ProductsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 10:18 PM
 * WebFluxApp2
 */

@Service
public class ProductServeiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Flux<ProductsDto> getAllProducts() {
        Flux<ProductsDto> productsDtoFlux = productRepository.findAll().map(EntityDTOConvertor::productsToProductsDto);
        return productsDtoFlux;
    }

    @Override
    public Mono<ProductsDto> getProductById(String id) {
        return productRepository.findById(id).map(EntityDTOConvertor::productsToProductsDto);
    }
    @Override
    public Mono<ProductsDto> addProduct(Mono<ProductsDto> productsDtoMono) {
        return productsDtoMono.map(EntityDTOConvertor::productDTOToProduct).flatMap(productRepository::insert).map(EntityDTOConvertor::productsToProductsDto);
    }

    @Override
    public Mono<ProductsDto> updateProduct(Mono<ProductsDto> productsDtoMono) {
        return productsDtoMono.map(EntityDTOConvertor::productDTOToProduct).flatMap(productRepository::save).map(EntityDTOConvertor::productsToProductsDto);
    }


    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
