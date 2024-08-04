package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {
    private long cartItemId;
    private CartDTO cart;
    private ProductDTO product;
    private int quantity;
    private double discount;
    private double productPrice;
}
