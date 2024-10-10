package com.alexmarcos.apisearchproducts.mapper;

import com.alexmarcos.apisearchproducts.dto.ProductDTO;
import com.alexmarcos.apisearchproducts.models.ProductModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public ProductDTO toDTO(ProductModel productModel) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productModel.getId());
        productDTO.setNombre(productModel.getNombre());
        productDTO.setImg(productModel.getImg());
        productDTO.setCategoria(productModel.getCategoria());
        productDTO.setPrecio(productModel.getPrecio());
        productDTO.setDescripcion(productModel.getDescripcion());
        return productDTO;
    }

    public List<ProductDTO> toDTOList(List<ProductModel> productModels) {
        return productModels.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public ProductModel toModel(ProductDTO productDTO) {
        ProductModel productModel = new ProductModel();
        productModel.setNombre(productDTO.getNombre());
        productModel.setImg(productDTO.getImg());
        productModel.setCategoria(productDTO.getCategoria());
        productModel.setPrecio(productDTO.getPrecio());
        productModel.setDescripcion(productDTO.getDescripcion());
        return productModel;
    }
}