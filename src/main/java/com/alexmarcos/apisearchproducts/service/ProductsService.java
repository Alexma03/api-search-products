// ProductsService.java
package com.alexmarcos.apisearchproducts.service;

import com.alexmarcos.apisearchproducts.dto.ProductDTO;
import com.alexmarcos.apisearchproducts.mapper.ProductMapper;
import com.alexmarcos.apisearchproducts.models.ProductModel;
import com.alexmarcos.apisearchproducts.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;
    private final ProductMapper productMapper;

    public ProductsService(ProductsRepository productsRepository, ProductMapper productMapper) {
        this.productsRepository = productsRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDTO> getProducts() {
        return productMapper.toDTOList(productsRepository.findAll());
    }

    public void addProduct(ProductDTO productDTO) {
        if (productsRepository.findByNombre(productDTO.getNombre()).isPresent()) {
            throw new IllegalArgumentException("Product with the same name already exists");
        }
        ProductModel productModel = productMapper.toModel(productDTO);
        productsRepository.save(productModel);
    }

    public ProductDTO getProduct(Integer id) {
        return productMapper.toDTO(Objects.requireNonNull(productsRepository.findById(id).orElse(null)));
    }
}