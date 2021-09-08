package com.example.demo.model;

public class Item {

    private double price;
    private String name;
    private Info info;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
        this.info = new Info("Cool product", 4.5, "Walmart");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
