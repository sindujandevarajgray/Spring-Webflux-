package com.gray.WebFluxApp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 9:59 PM
 * WebFluxApp2
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductsDto {
    private String id;
    private String name;
    private String description;
    private double price;
}
