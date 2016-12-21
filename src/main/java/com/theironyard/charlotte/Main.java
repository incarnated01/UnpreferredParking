package com.theironyard.charlotte;

import com.google.gson.JsonParser;
import jodd.json.JsonSerializer;


import spark.Spark;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Lot> parkingLots = new ArrayList<>();
    private static JsonParser parser = new JsonParser();
    private static JsonSerializer serializer = new JsonSerializer();

    public static void main(String[] args) {
        String port = System.getenv("PORT");

        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }

        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });

        parkingLots.add(new Lot("0", 15, 5));
        parkingLots.add(new Lot("1", 15, 5));
        parkingLots.add(new Lot("2", 15, 5));
        parkingLots.add(new Lot("3", 15, 5));

        Spark.get("/lots", (request, response) -> {
            System.out.println("The current status of the lots: ");
            return serializer.serialize(parkingLots);
        });
        Spark.post("/cars", (request, response) -> {
            System.out.println("");
            System.out.println("");

            return "";
        });
    }
}

