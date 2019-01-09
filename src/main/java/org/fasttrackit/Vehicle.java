package org.fasttrackit;

public class Vehicle {

    public static int aplicationTotalNumberOfVehicles = 1;

    private String name;
    private String colour;
    private double mileage;
    private long totalKm;

    public Vehicle() {
        aplicationTotalNumberOfVehicles++;
    }

    public double accelerate (double speed, double durationInHours){
        System.out.println(name + "accelerated with " + speed + " km/h for "+ durationInHours + " hours.");

        double distance = speed * durationInHours;
        System.out.println("Traveled distance " + distance);
        return distance;
    }
//metoda folosita doar pt exemplificarea co-variant return type
    public Vehicle returnSomeVehicle(){
        return this;
    }

//method overloading - mai jos
    public double accelerate (double speed){
//        1.varianta cu duplicare de cod
//        double durationInHours = 1.5;
//        System.out.println(name + "accelerated with " + speed + " km/h for "+ durationInHours + " hours.");
//
//        double distance = speed * durationInHours;
//        System.out.println("Traveled distance " + distance);
//        return distance;

//        2.varianta fara duplicare de cod-mai jos
        return accelerate(speed,1);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }
}
