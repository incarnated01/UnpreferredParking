package com.theironyard.charlotte;

import jodd.json.JsonSerializer;
import jodd.json.JsonParser;



import spark.Spark;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Lot> parkingLots = new ArrayList<>();
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

        List<Cars> lot0 = new ArrayList<>();
        List<Cars> lot1 = new ArrayList<>();
        List<Cars> lot2 = new ArrayList<>();
        List<Cars> lot3 = new ArrayList<>();

        Main.parkingLots.add(new Lot(0, 15, 5, lot0));
        Main.parkingLots.add(new Lot(1, 15, 5, lot1));
        Main.parkingLots.add(new Lot(2, 15, 5, lot2));
        Main.parkingLots.add(new Lot(3, 15, 5, lot3));


        lot0.add(new Cars("jeep", "renegade", 2, 66));


        Spark.get("/lots", (request, response) -> {
            System.out.println("The current status of the lots: ");
            return serializer.deep(true).serialize(Main.parkingLots);
        });
        Spark.post("/park", (request, response) -> {
            Park parking = parser.parse(request.body(), Park.class);

            for (Lot lot : parkingLots) {
                if (lot.getId() == parking.getId()) {
                    if (parking.getSize() * lot.getRate() <= parking.getFunds()
                            && lot.getCapacity() - parking.getSize() >= 0){
                        lot.getInLot().add(new Cars(parking.getMake(), parking.getModel(),parking.getSize(),parking.getFunds()));
                    }
                }
            }
            return "";
        });

    }
}

