package org.fasttrackit;

public class Engine {

    String manufacturer;
    
//    suprascrierea metodei to string din clasa Object
    @Override
    public String toString() {
        return "Engine{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
