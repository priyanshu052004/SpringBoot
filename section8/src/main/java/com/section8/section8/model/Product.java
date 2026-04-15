package com.section8.section8.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productid;


    private String name;
    private String description;
    private BigDecimal price;
    private String brandName;
    private String batchName;








}
