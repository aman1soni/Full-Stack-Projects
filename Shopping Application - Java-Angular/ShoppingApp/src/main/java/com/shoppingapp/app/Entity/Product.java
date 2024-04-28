package com.shoppingapp.app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Product {
    @Id
    private long id;

    @Column
    private String productName;

    @Column
    private List<Byte> productImage;



}
