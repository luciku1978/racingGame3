package org.fasttrackit;

import org.fasttrackit.cheater.CheatingCar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//polymorfism = an object can take multiple forms
        Vehicle cheatingCar2 = new CheatingCar();
//        apelarea metodei accelerate pe obiectul cheatingcar2 va apela metoda din CheatingCar (suprascrisa)
// si nu din clasa Vehicle
        cheatingCar2.accelerate(10,2);
//type casting
        ((CheatingCar) cheatingCar2).testMethod();

        Engine engine = new Engine();
        engine.manufacturer="Renault";

        System.out.println(engine);

//        new Car(engine);

        CheatingCar cheatingCar1 =new CheatingCar();
        cheatingCar1.setName("Mercedes");

        System.out.println(cheatingCar1.accelerate(80,2));

//        Vehicle vehicle = new Vehicle();
//        double distance = vehicle.accelerate(99.9,0.5);
//

        //declaring a variable and instantiation a Car object
//        // this is also called initializing a variable
//       Car firstCompetitor = new Car(new Engine());
//
//       firstCompetitor.setName("Dacia");
//       firstCompetitor.setColour("black");
//       firstCompetitor.setTotalKm(50);
//       firstCompetitor.setMileage(9.5);
//
//       //local variables are variables declared inside a method
//        //they don't receive default values
//
//        Car secondCompetitor = new Car(new Engine());
//        secondCompetitor.name = "Golf";
//
//        Engine firstEngine = new Engine();
//        firstEngine.manufacturer = "Renault";
//        //prints a variable
//
//
//        //System.out.println(firstEngine.manufacturer);
//        //System.out.println(firstCompetitor.engine.manufacturer);
//
//
//        double traveledDistance = firstCompetitor.accelerate(100,50);
//        System.out.println("Traveled distance " + traveledDistance+ " km");
//        AutoVehicle autoVehicle = new AutoVehicle(new Engine());


//        vehicle.aplicationTotalNumberOfVehicles = 1;
//        System.out.println("Total from vehicle 1: " + vehicle.aplicationTotalNumberOfVehicles);
//
//        Vehicle vehicle2 = new Vehicle();
//
//        Vehicle.aplicationTotalNumberOfVehicles = 10;
//        System.out.println("Total from vehicle 2: " + vehicle2.aplicationTotalNumberOfVehicles);
//        System.out.println("Total from vehicle 1: " + vehicle.aplicationTotalNumberOfVehicles);

    }


}
