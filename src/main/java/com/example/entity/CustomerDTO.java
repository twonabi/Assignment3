package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO {
    private String customerId;
    private String password;
    private String customerName;
    private int age;
    private String rating;
    private String occupation;
    private int reserves;

}
