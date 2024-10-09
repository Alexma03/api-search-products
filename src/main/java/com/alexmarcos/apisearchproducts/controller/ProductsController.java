package com.alexmarcos.apisearchproducts.controller;

import com.alexmarcos.apisearchproducts.dto.ProductDTO;
import com.alexmarcos.apisearchproducts.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/get-products")
    public List<ProductDTO> getProducts() {
        return productsService.getProducts();
    }
}