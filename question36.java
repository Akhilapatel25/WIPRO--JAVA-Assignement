package javaassignment;


class Tank {
    private boolean isFilled;
    private boolean isReleased;

    // Fill the tank
    public void fillTank() {
        isFilled = true;
        isReleased = false;
        System.out.println("Tank is filled.");
    }

    // Empty the tank
    public void emptyTank() {
        isFilled = false;
        System.out.println("Tank is emptied.");
    }

    // Release the tank properly
    public void releaseTank() {
        isReleased = true;
        System.out.println("Tank has been released properly.");
    }

    // finalize() method to check if tank was released
    @Override
    protected void finalize() throws Throwable {
        try {
            if (!isReleased) {
                System.out.println("Warning: Tank was not released before garbage collection!");
            } else {
                System.out.println("Tank cleaned up properly.");
            }
        } finally {
            super.finalize(); // Always call superclass finalize
        }
    }
}

public class question36 {
    public static void main(String[] args) {
        // Scenario 1: Proper usage - releaseTank called
        Tank tank1 = new Tank();
        tank1.fillTank();
        tank1.emptyTank();
        tank1.releaseTank();

        // Scenario 2: Improper usage - releaseTank not called
        Tank tank2 = new Tank();
        tank2.fillTank();

        // Suggest garbage collection (not guaranteed immediately)
        tank1 = null;
        tank2 = null;

        System.gc(); // Suggest GC to run finalize()

        // Add some delay to allow finalize() to be called
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/*
 * Tank is filled.
Tank is emptied.
Tank has been released properly.
Tank is filled.
Warning: Tank was not released before garbage collection!
Tank cleaned up properly.
*/
