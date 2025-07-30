package javaassignment;


import static java.lang.System.out;
import java.util.Arrays;

public class question23 {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.describe();

        System.out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}

// Hall class
class Hall {
    public void describe() {
        out.println("This is the first room while entering the house");
    }
}

// Kitchen class
class Kitchen {
    public void showAppliances() {
        String[] appliances = { "Fridge", "Microwave", "Oven", "Dishwasher" };

        System.out.println("Kitchen Appliances:");
        for (String app : appliances) {
            System.out.println("- " + app);
        }

        // Copy the array
        String[] copy = Arrays.copyOf(appliances, appliances.length);

        System.out.println("\nCopied Appliances Array:");
        for (String c : copy) {
            System.out.println("- " + c);
        }
    }
}


/*
This is the first room while entering the house

Kitchen Appliances:
- Fridge
- Microwave
- Oven
- Dishwasher

Copied Appliances Array:
- Fridge
- Microwave
- Oven
*/