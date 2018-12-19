package org.fasttrackit;

public class Vehicle {

    String name;
    String colour;

    double mileage;
    long totalKm;


    public double accelerate (double speed, double durationInHours){
        System.out.println(name + "accelerated with " + speed + " km/h in "+ durationInHours + " minutes.");


        double distance = speed * durationInHours;
        System.out.println("Traveled distance " + distance);
        return distance;
    }
}
