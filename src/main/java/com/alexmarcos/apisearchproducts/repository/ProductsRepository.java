package com.alexmarcos.apisearchproducts.repository;

import com.alexmarcos.apisearchproducts.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<ProductModel, Integer> {
    List<ProductModel> findAll();
}