package com.theironyard.charlotte;

import java.util.List;

/**
 * Created by stephenwilliamson on 12/20/16.
 */
public class Lot {
    private String id;
    private int capacity;
    private int rate;
    private List<Cars> inLot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public List<Cars> getInLot() {
        return inLot;
    }

    public void setInLot(List<Cars> inLot) {
        this.inLot = inLot;
    }

    public Lot(String id, int capacity, int rate, List<Cars> inLot) {

        this.id = id;
        this.capacity = capacity;
        this.rate = rate;
        this.inLot = inLot;
    }
}