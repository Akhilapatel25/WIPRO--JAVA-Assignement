package javaassignment;


//Abstract class
abstract class Person {
 abstract void eat();
 abstract void exercise();
}


class Athlete extends Person {
 @Override
 void eat() {
     System.out.println("Athlete eats a balanced diet rich in proteins and carbs.");
 }

 @Override
 void exercise() {
     System.out.println("Athlete exercises daily with intense workouts and training.");
 }
}

//Subclass 2: LazyPerson
class LazyPerson extends Person {
 @Override
 void eat() {
     System.out.println("Lazy person eats snacks and fast food while watching TV.");
 }

 @Override
 void exercise() {
     System.out.println("Lazy person skips exercise and prefers lying on the couch.");
 }
}

//Main class to test
public class question21 {
 public static void main(String[] args) {
     Person athlete = new Athlete();
     Person lazy = new LazyPerson();

     System.out.println("Athlete:");
     athlete.eat();
     athlete.exercise();

     System.out.println("\nLazy Person:");
     lazy.eat();
     lazy.exercise();
 }
}
