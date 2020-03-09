package com.epam.AdapterPattern;

public class Burger {
    private String burgerName;
    private String burgerSize;
    int burgerPrice;

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getBurgerSize() {
        return burgerSize;
    }

    public void setBurgerSize(String burgerSize) {
        this.burgerSize =burgerSize;
    }

    public int getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(int burgerPrice) {
        this.burgerPrice = burgerPrice;
    }


}