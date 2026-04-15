package com.section8.section8.dto;


import lombok.*;
import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {

    private Long productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String brandName;



}
