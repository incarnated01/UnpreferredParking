package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 12/21/16.
 */
public class Park {
    private String id;
    private String make;
    private String model;
    private int size;
    private int funds;

    public Park(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Park(String id, String model, int size, int funds) {

        this.id = id;
        this.model = model;
        this.size = size;
        this.funds = funds;
    }
}
