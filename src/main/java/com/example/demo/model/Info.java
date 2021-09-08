package com.example.demo.model;

public class Info {

    private String company;
    private double weight;
    private String comment;

    public Info (String comment, double weight, String company){
        this.comment = comment;
        this.weight = weight;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
