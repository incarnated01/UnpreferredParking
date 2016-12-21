package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 12/20/16.
 */
public class Lot {
    private String id;
    private int capacity;
    private int rate;

    public Lot() {
    }

    public Lot(String id, int capacity, int rate) {
        this.id = id;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
