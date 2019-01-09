package org.fasttrackit;

public class Car extends AutoVehicle{
    //instance variables declared as properties of a class
    //they receive dafault values:null for objects, 0 for numbers and false for boolean
    
    int doorCount;
   

    public Car(Engine engine) {
        super(engine);
    }
}
