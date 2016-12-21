package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 12/20/16.
 */
public class Vehicle {
    private String make;
    private String model;
    private int size;
    private int funds;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public Vehicle(String make, String model, int size, int funds) {

        this.make = make;
        this.model = model;
        this.size = size;
        this.funds = funds;
    }
}
