package com.gray.WebFluxApp2.Utils;

import com.gray.WebFluxApp2.dto.ProductsDto;
import com.gray.WebFluxApp2.entity.Product;
import org.springframework.beans.BeanUtils;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 10:02 PM
 * WebFluxApp2
 */
public class EntityDTOConvertor {

    public static ProductsDto productsToProductsDto(Product product){
        ProductsDto productsDto = new ProductsDto();
        BeanUtils.copyProperties(product,productsDto);
        return productsDto;
    }
    public static Product productDTOToProduct(ProductsDto dto){
        Product product = new Product();
        BeanUtils.copyProperties(dto,product);
        return product;
    }
}
