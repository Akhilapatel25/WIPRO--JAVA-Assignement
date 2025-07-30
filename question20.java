package javaassignment;


//Abstract class
abstract class Vehicle {
 abstract void startEngine();
 abstract void stopEngine();
}

//Subclass 1: Car
class Car extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("Car engine started with a key or push button.");
 }

 @Override
 void stopEngine() {
     System.out.println("Car engine stopped by turning the key off or pressing the stop button.");
 }
}


//Subclass 2: Motorcycle
class Motorcycle extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("Motorcycle engine started using kick or electric start.");
 }

 @Override
 void stopEngine() {
     System.out.println("Motorcycle engine stopped by turning the key off.");
 }
}

//Main class to test
public class question20 {
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     Vehicle myBike = new Motorcycle();

     System.out.println("Car:");
     myCar.startEngine();
     myCar.stopEngine();

     System.out.println("\nMotorcycle:");
     myBike.startEngine();
     myBike.stopEngine();
 }
}
