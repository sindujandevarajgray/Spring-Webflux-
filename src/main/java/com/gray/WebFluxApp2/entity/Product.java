package com.gray.WebFluxApp2.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.CollectionCallback;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 9:22 PM
 * WebFluxApp2
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collation = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
}
