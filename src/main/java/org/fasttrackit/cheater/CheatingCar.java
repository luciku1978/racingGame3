package org.fasttrackit.cheater;


import org.fasttrackit.AutoVehicle;
import org.fasttrackit.Vehicle;

public class CheatingCar extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {


//        double cheatingSpeed = speed*3;
//        return super.accelerate(cheatingSpeed,durationInHours);

        System.out.println("Accelerating as cheating car!");

        System.out.println(getName() + " accelerated with " + speed + " km/h for " + durationInHours + " hours.");

        double distance = 2 * speed * durationInHours;
        System.out.println("Traveled distance " + distance);
        return distance;
    }

//    co-variant return type


    @Override
    public AutoVehicle returnSomeVehicle() {
        return new AutoVehicle();
    }

    public void testMethod(){

    }
}
