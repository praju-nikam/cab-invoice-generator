package com.bridgelabz;

public class CabInvoiceGenerator {
    RideRepository rideRepository = new RideRepository();
    private final int COST_PER_KM = 10;
    private final int COST_PER_MINUTE = 1;
    public int MIN_FARE = 5;
    double totalFare;

    public double calculateFare(double distance, int time) {

        totalFare = COST_PER_KM * distance + COST_PER_MINUTE * time;
        if (totalFare < MIN_FARE)
            totalFare = MIN_FARE;
        return totalFare;
    }
}