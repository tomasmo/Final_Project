package com.project.Final_Project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private String productName;
    private int productQuantity;
    private int productPrice;
    // private boolean isAvailable;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    // public boolean isAvailable() {
    //     return isAvailable;
    // }
    //
    // public void setAvailable(boolean available) {
    //     isAvailable = available;
    // }

}
