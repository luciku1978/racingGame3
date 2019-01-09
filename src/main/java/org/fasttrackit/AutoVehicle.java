package org.fasttrackit;

public class AutoVehicle extends  Vehicle {
    Engine engine;
    boolean running;


    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
//    constructor overloading = se mai face un nou constructor
//    cu parametrii diferiti(prin numar, tip, ordine , etc)
    public AutoVehicle(){
        this(new Engine());
    }
}
