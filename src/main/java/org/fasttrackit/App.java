package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   //declaring a variable and instantiation a Car object
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

        Vehicle vehicle = new Vehicle();
        vehicle.aplicationTotalNumberOfVehicles = 1;
        System.out.println("Total from vehicle 1: " + vehicle.aplicationTotalNumberOfVehicles);

        Vehicle vehicle2 = new Vehicle();

        Vehicle.aplicationTotalNumberOfVehicles = 10;
        System.out.println("Total from vehicle 2: " + vehicle2.aplicationTotalNumberOfVehicles);
        System.out.println("Total from vehicle 1: " + vehicle.aplicationTotalNumberOfVehicles);

    }


}
