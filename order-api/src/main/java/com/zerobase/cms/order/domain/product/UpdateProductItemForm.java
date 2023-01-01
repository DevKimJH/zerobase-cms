package com.zerobase.cms.order.domain.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductItemForm {
    private Long id;
    private String name;
    private Integer price;
    private Integer count;
}
