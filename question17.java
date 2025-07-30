package javaassignment;



class vehicle {
	
	// Base class
	
	    String color;
	    int wheels;
	    String model;

	    public vehicle(String color, int wheels, String model) {
	        this.color = color;
	        this.wheels = wheels;
	        this.model = model;
	    }

	    public void displayInfo() {
	        System.out.println("Vehicle Info:");
	        System.out.println("Color: " + color);
	        System.out.println("Wheels: " + wheels);
	        System.out.println("Model: " + model);
	    }

	    public void start() {
	        System.out.println("Vehicle is starting...");
	    }

	    public void stop() {
	        System.out.println("Vehicle has stopped.");
	    }
	}

	// Subclass: Car
	class car extends vehicle {
	    public car(String color, String model) {
	        super(color, 4, model);
	    }

	    public void playMusic() {
	        System.out.println("Car is playing music.");
	    }
	}

	// Subclass: Bus
	class Bus extends vehicle {
	    public Bus(String color, String model) {
	        super(color, 6, model);
	    }

	    public void openDoors() {
	        System.out.println("Bus doors are opening.");
	    }
	}

	// Subclass: Truck
	class Truck extends vehicle {
	    public Truck(String color, String model) {
	        super(color, 8, model);
	    }

	    public void loadGoods() {
	        System.out.println("Truck is loading goods.");
	    }
	}

	// Main class
	public class question17 {
		
	    public static void main(String[] args) {
	        car car = new car("Red", "Suzuki Swift");
	        Bus bus = new Bus("Yellow", "Volvo Bus");
	        Truck truck = new Truck("Blue", "Tata Truck");

	        System.out.println("\n--- Car Details ---");
	        car.displayInfo();
	        car.start();
	        car.playMusic();
	        car.stop();

	        System.out.println("\n--- Bus Details ---");
	        bus.displayInfo();
	        bus.start();
	        bus.openDoors();
	        bus.stop();

	        System.out.println("\n--- Truck Details ---");
	        truck.displayInfo();
	        truck.start();
	        truck.loadGoods();
	        truck.stop();
	    }
	}


/*
 * 
 * 
--- Car Details ---
Vehicle Info:
Color: Red
Wheels: 4
Model: Suzuki Swift
Vehicle is starting...
Car is playing music.
Vehicle has stopped.

--- Bus Details ---
Vehicle Info:
Color: Yellow
Wheels: 6
Model: Volvo Bus
Vehicle is starting...
Bus doors are opening.
Vehicle has stopped.

--- Truck Details ---
Vehicle Info:
Color: Blue
Wheels: 8
Model: Tata Truck
Vehicle is starting...
Truck is loading goods.
Vehicle has stopped.

*/
