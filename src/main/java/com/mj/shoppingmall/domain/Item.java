package com.mj.shoppingmall.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
public class Item {
    @NonNull private Long id;
    @NonNull private String itemName;
    @NonNull private String brandName;
    @NonNull private Integer price;
    private Integer discountPercentage;
    @NonNull private Integer deliveryPrice;
    private String deliveryGuide;
    private ArrayList<String> options = new ArrayList<>();
    private Integer quantity;
    private String thumbnailImage;
    private String description;
}
