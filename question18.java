package javaassignment;


public class question18{

    // Lion class
    static class Lion {
        String color = "Golden";
        int weight = 190;
        int age = 8;

        boolean isVegetarian() { return false; }
        boolean canClimb() { return false; }
        String sound() { return "Roar"; }
    }

    // Tiger class
    static class Tiger {
        String color = "Orange with black stripes";
        int weight = 220;
        int age = 6;

        boolean isVegetarian() { return false; }
        boolean canClimb() { return false; }
        String sound() { return "Growl"; }
    }

    // Deer class
    static class Deer {
        String color = "Brown";
        int weight = 90;
        int age = 4;

        boolean isVegetarian() { return true; }
        boolean canClimb() { return false; }
        String sound() { return "Bleat"; }
    }

    // Monkey class
    static class Monkey {
        String color = "Grey";
        int weight = 35;
        int age = 5;

        boolean isVegetarian() { return true; }
        boolean canClimb() { return true; }
        String sound() { return "Chatter"; }
    }

    // Elephant class
    static class Elephant {
        String color = "Grey";
        int weight = 5000;
        int age = 25;

        boolean isVegetarian() { return true; }
        boolean canClimb() { return false; }
        String sound() { return "Trumpet"; }
    }

    // Giraffe class
    static class Giraffe {
        String color = "Yellow with brown patches";
        int weight = 800;
        int age = 12;

        boolean isVegetarian() { return true; }
        boolean canClimb() { return false; }
        String sound() { return "Hum"; }
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println("Lion - Color: " + lion.color + ", Age: " + lion.age + ", Weight: " + lion.weight);
        System.out.println("Is Vegetarian? " + lion.isVegetarian());
        System.out.println("Can Climb? " + lion.canClimb());
        System.out.println("Sound: " + lion.sound());
        System.out.println();

        Tiger tiger = new Tiger();
        System.out.println("Tiger - Color: " + tiger.color + ", Age: " + tiger.age + ", Weight: " + tiger.weight);
        System.out.println("Is Vegetarian? " + tiger.isVegetarian());
        System.out.println("Can Climb? " + tiger.canClimb());
        System.out.println("Sound: " + tiger.sound());
        System.out.println();

        Deer deer = new Deer();
        System.out.println("Deer - Color: " + deer.color + ", Age: " + deer.age + ", Weight: " + deer.weight);
        System.out.println("Is Vegetarian? " + deer.isVegetarian());
        System.out.println("Can Climb? " + deer.canClimb());
        System.out.println("Sound: " + deer.sound());
        System.out.println();

        Monkey monkey = new Monkey();
        System.out.println("Monkey - Color: " + monkey.color + ", Age: " + monkey.age + ", Weight: " + monkey.weight);
        System.out.println("Is Vegetarian? " + monkey.isVegetarian());
        System.out.println("Can Climb? " + monkey.canClimb());
        System.out.println("Sound: " + monkey.sound());
        System.out.println();

        Elephant elephant = new Elephant();
        System.out.println("Elephant - Color: " + elephant.color + ", Age: " + elephant.age + ", Weight: " + elephant.weight);
        System.out.println("Is Vegetarian? " + elephant.isVegetarian());
        System.out.println("Can Climb? " + elephant.canClimb());
        System.out.println("Sound: " + elephant.sound());
        System.out.println();

        Giraffe giraffe = new Giraffe();
        System.out.println("Giraffe - Color: " + giraffe.color + ", Age: " + giraffe.age + ", Weight: " + giraffe.weight);
        System.out.println("Is Vegetarian? " + giraffe.isVegetarian());
        System.out.println("Can Climb? " + giraffe.canClimb());
        System.out.println("Sound: " + giraffe.sound());
        System.out.println();
    }
}


/*

public class VandalurZoo {

// Lion class
static class Lion {
    String color = "Golden";
    int weight = 190;
    int age = 8;

    boolean isVegetarian() { return false; }
    boolean canClimb() { return false; }
    String sound() { return "Roar"; }
}

// Tiger class
static class Tiger {
    String color = "Orange with black stripes";
    int weight = 220;
    int age = 6;

    boolean isVegetarian() { return false; }
    boolean canClimb() { return false; }
    String sound() { return "Growl"; }
}

// Deer class
static class Deer {
    String color = "Brown";
    int weight = 90;
    int age = 4;

    boolean isVegetarian() { return true; }
    boolean canClimb() { return false; }
    String sound() { return "Bleat"; }
}

// Monkey class
static class Monkey {
    String color = "Grey";
    int weight = 35;
    int age = 5;

    boolean isVegetarian() { return true; }
    boolean canClimb() { return true; }
    String sound() { return "Chatter"; }
}

// Elephant class
static class Elephant {
    String color = "Grey";
    int weight = 5000;
    int age = 25;

    boolean isVegetarian() { return true; }
    boolean canClimb() { return false; }
    String sound() { return "Trumpet"; }
}

// Giraffe class
static class Giraffe {
    String color = "Yellow with brown patches";
    int weight = 800;
    int age = 12;

    boolean isVegetarian() { return true; }
    boolean canClimb() { return false; }
    String sound() { return "Hum"; }
}

public static void main(String[] args) {
    Lion lion = new Lion();
    System.out.println("Lion - Color: " + lion.color + ", Age: " + lion.age + ", Weight: " + lion.weight);
    System.out.println("Is Vegetarian? " + lion.isVegetarian());
    System.out.println("Can Climb? " + lion.canClimb());
    System.out.println("Sound: " + lion.sound());
    System.out.println();

    Tiger tiger = new Tiger();
    System.out.println("Tiger - Color: " + tiger.color + ", Age: " + tiger.age + ", Weight: " + tiger.weight);
    System.out.println("Is Vegetarian? " + tiger.isVegetarian());
    System.out.println("Can Climb? " + tiger.canClimb());
    System.out.println("Sound: " + tiger.sound());
    System.out.println();

    Deer deer = new Deer();
    System.out.println("Deer - Color: " + deer.color + ", Age: " + deer.age + ", Weight: " + deer.weight);
    System.out.println("Is Vegetarian? " + deer.isVegetarian());
    System.out.println("Can Climb? " + deer.canClimb());
    System.out.println("Sound: " + deer.sound());
    System.out.println();

    Monkey monkey = new Monkey();
    System.out.println("Monkey - Color: " + monkey.color + ", Age: " + monkey.age + ", Weight: " + monkey.weight);
    System.out.println("Is Vegetarian? " + monkey.isVegetarian());
    System.out.println("Can Climb? " + monkey.canClimb());
    System.out.println("Sound: " + monkey.sound());
    System.out.println();

    Elephant elephant = new Elephant();
    System.out.println("Elephant - Color: " + elephant.color + ", Age: " + elephant.age + ", Weight: " + elephant.weight);
    System.out.println("Is Vegetarian? " + elephant.isVegetarian());
    System.out.println("Can Climb? " + elephant.canClimb());
    System.out.println("Sound: " + elephant.sound());
    System.out.println();

    Giraffe giraffe = new Giraffe();
    System.out.println("Giraffe - Color: " + giraffe.color + ", Age: " + giraffe.age + ", Weight: " + giraffe.weight);
    System.out.println("Is Vegetarian? " + giraffe.isVegetarian());
    System.out.println("Can Climb? " + giraffe.canClimb());
    System.out.println("Sound: " + giraffe.sound());
    System.out.println();
}
}

*/