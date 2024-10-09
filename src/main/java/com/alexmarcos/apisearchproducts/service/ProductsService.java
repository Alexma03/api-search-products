package com.alexmarcos.apisearchproducts.service;

import com.alexmarcos.apisearchproducts.dto.ProductDTO;
import com.alexmarcos.apisearchproducts.mapper.ProductMapper;
import com.alexmarcos.apisearchproducts.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}