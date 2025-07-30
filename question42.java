package javaassignment;


public class question42 {

    // Method that throws an exception
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }

    // Method that catches and rethrows the exception
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught exception in someMethod, rethrowing...");
            throw e; // Rethrow the same exception
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught rethrown exception in main:");
            e.printStackTrace(); // Print the full stack trace
        }
    }
}

/*
 * Caught exception in someMethod, rethrowing...
Caught rethrown exception in main:
java.lang.Exception: Exception thrown in someMethod2
	at javaassignment/javaassignment.question42.someMethod2(question42.java:8)
	at javaassignment/javaassignment.question42.someMethod(question42.java:14)
	at javaassignment/javaassignment.question42.main(question42.java:24)
 */
