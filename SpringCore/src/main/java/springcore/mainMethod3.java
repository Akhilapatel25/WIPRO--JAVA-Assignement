package springcore;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("     AUTOWIRED ANNOTATION DEMO");
        System.out.println("===========================================");
        System.out.println("Options:");
        System.out.println("1. Autowired");
        System.out.println("2. Autowired with Qualifier");
        System.out.print("Select option: ");
        int choice = sc.nextInt();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_q3.xml");

        Freshman3 student = (Freshman3) context.getBean("student");

        switch (choice) {
            case 1:
                System.out.println("\n🔹 Autowired (by type):");
                student.getRoom();
                break;
            case 2:
                System.out.println("\n🔹 Autowired with @Qualifier(\"roomB\"):");
                System.out.println("👉 Please uncomment @Qualifier in Freshman.java to see the effect.");
                student.getRoom();
                break;
            default:
                System.out.println("❌ Invalid option.");
        }

        sc.close();
    }
}
