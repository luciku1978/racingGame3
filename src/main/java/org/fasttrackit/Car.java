package org.fasttrackit;

public class Car extends AutoVehicle{
    //instance variables declared as properties of a class
    //they receive dafault values:null for objects, 0 for numbers and false for boolean


    String name;
    String color;
    int doorCount;
    double mileage; //consum//
    boolean running;
    long totalKm;
    Engine engine; //compozitie, relatie de tip "has-a"


    public Car(Engine engine) {
        super(engine);
    }
}
