package com.gray.WebFluxApp2.Repository;

import com.gray.WebFluxApp2.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 10:07 PM
 * WebFluxApp2
 */
@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
