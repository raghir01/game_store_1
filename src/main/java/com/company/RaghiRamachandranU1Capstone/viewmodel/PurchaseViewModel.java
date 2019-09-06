package com.company.RaghiRamachandranU1Capstone.viewmodel;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class PurchaseViewModel {
    private String name;
    private String street;
    private String city;
    private String zip;
    @NotNull
    @NotEmpty
    private String itemType;
    @NotNull
    private int itemId;
    @Positive
    @Min(1)
    private int quantity;
    @Size(min = 2, max = 2, message = "State must be of length 2")
    private String state;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

