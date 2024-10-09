package com.alexmarcos.apisearchproducts.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    private Integer id;
    private String nombre;
    private String img;
    private String categoria;
    private BigDecimal precio;
    private String descripcion;
}