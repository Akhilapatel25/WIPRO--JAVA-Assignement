package javaassignment;


public class question32 {
    public static void main(String[] args) {

        try {
            // Uncomment one block at a time to demonstrate different exceptions

            // 1. NegativeArraySizeException
           int[] arr1 = new int[-3];

            // 2. ArrayIndexOutOfBoundsException
           // int[] arr2 = new int[2];
           // System.out.println(arr2[5]);

            // 3. StringIndexOutOfBoundsException
            //String str = "hello";
            //System.out.println(str.charAt(10));

            // 4. IndexOutOfBoundsException (example using ArrayList)
            // java.util.ArrayList<String> list = new java.util.ArrayList<>();
            // list.add("A");
            // System.out.println(list.get(5));

            // 5. NullPointerException
            // String text = null;
           // System.out.println(text.length());

            // 6. ArithmeticException
            //int result = 10 / 0;

        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught General Exception");
            e.printStackTrace();
        }
    }
}



/*
 * Caught NegativeArraySizeException
java.lang.NegativeArraySizeException: -3
	at javaassignment/javaassignment.question32.main(question32.java:11)
	
	
	
	
	
	Caught ArrayIndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2
	at javaassignment/javaassignment.question32.main(question32.java:15)
	
	
	
	
	Caught StringIndexOutOfBoundsException
java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 5
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	
	
	
	
	Caught NullPointerException
java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
	at javaassignment/javaassignment.question32.main(question32.java:28)
	
	
	
	Caught ArithmeticException
java.lang.ArithmeticException: / by zero
	at javaassignment/javaassignment.question32.main(question32.java:31)

*/