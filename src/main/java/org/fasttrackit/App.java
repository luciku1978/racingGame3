package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   //declaring a variable and instantiation a Car object
        // this is also called initializing a variable
       Car firstCompetitor = new Car();

       firstCompetitor.name = "Dacia";
       firstCompetitor.color = "black";
       firstCompetitor.doorCount = 5;
       firstCompetitor.mileage = 9.5;

       //local variables are variables declared inside a method
        //they don't receive default values

        Car secondCompetitor = new Car();
        secondCompetitor.name = "Golf";

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";
        //prints a variable
        System.out.println(firstEngine.manufacturer);

        firstCompetitor.engine = firstEngine;

        firstCompetitor.engine.manufacturer = "BMW";


        System.out.println(firstEngine.manufacturer);
        System.out.println(firstCompetitor.engine.manufacturer);

    }


}
