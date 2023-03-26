package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {   System.out.println("Hello world");


         Car carReference = new Car();
         carReference.name = "ferrari";
         carReference.maxSpeed = 300;
         carReference.fuellevel = 60;
         carReference.mileage = 12.5;
         carReference.totalTravelDistance = 0;
         carReference.damaged = true;
         carReference.doorCount = 1;
         carReference.color = "red";

         Engine engine1 = new Engine();
         engine1.manufactured = "Ferrari";
         engine1.capacity = 3000;

        System.out.println(carReference);

         carReference.engine = engine1;


        System.out.println("Engine1 capacity:" + engine1.capacity  );
        System.out.println("Car engine capacity: "+ carReference.engine.capacity);

        engine1.capacity = 4000;

        System.out.println("Car engine capacity after update: "+ carReference.engine.capacity);


         //concatamation
        System.out.println("Proprietes of car" + carReference.name);
        System.out.println("max speed" + carReference.maxSpeed);
        System.out.println("Milleage" + carReference.mileage);
        System.out.println("total travel distance" + carReference.totalTravelDistance);
        System.out.println("damaged" + carReference.damaged);
        System.out.println("door count" + carReference.doorCount);
        System.out.println("color" + carReference.color);
        System.out.println(carReference);


        Car car2 = new Car();
        car2.name = "renault";
        car2.fuellevel = 70;
        car2.totalTravelDistance = 100;

        car2.engine = new Engine();
        car2.engine.capacity = 2000;


        System.out.println("Propreites of car" + car2.name);
        System.out.println("max speed" +car2.maxSpeed);
        System.out.println("Milleage" + car2.mileage);
        System.out.println("total travel distance" + car2.totalTravelDistance);
        System.out.println("damaged" + car2.damaged);
        System.out.println("door count" + car2.doorCount);
        System.out.println("color" + car2.color);
        System.out.println(car2);

        System.out.println(carReference.name);

        System.out.println("Initial name for car1" + carReference.name);
        carReference.name = "Audi";
        System.out.println("Change name for car1" + carReference.name);

        carReference = new Car();
        System.out.println("Name of new car: " + carReference.name);
        carReference.name = "ww";


        carReference = car2;
        System.out.println("name of car reference 2 variables. Carreferences "+ carReference.name);
        System.out.println("name of car reference 2 variables. Car2 "+ car2.name);

        car2.name = "Dacia";

        System.out.println("Updated name of car reference 2 variables. Carreferences "+ carReference.name);
        System.out.println("Updated name of car reference 2 variables. Car2 "+ car2.name);

        car2 = null;






    }
}
