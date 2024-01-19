package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDTO {
    private int productNumber;
    private String productName;
    private int inventory;
    private int price;
    private String manufacturer;
}
