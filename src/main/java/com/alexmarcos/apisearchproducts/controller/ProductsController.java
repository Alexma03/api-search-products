package com.alexmarcos.apisearchproducts.controller;

import com.alexmarcos.apisearchproducts.dto.ProductDTO;
import com.alexmarcos.apisearchproducts.service.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = {"https://frontend-ecomerce-search.netlify.app", "http://localhost:5173"})
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/get-products")
    public List<ProductDTO> getProducts() {
        return productsService.getProducts();
    }

    @GetMapping("/delete-product/{id}")
    public void getProduct(@PathVariable Integer id) {
        productsService.deleteProduct(id);
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody ProductDTO productDTO) {
        productsService.addProduct(productDTO);
    }
}