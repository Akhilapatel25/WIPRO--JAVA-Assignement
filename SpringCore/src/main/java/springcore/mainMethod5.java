package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class mainMethod5 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config5.class);
        item5 item = context.getBean(item5.class);
        category5 category = item.getCategory();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item ID: ");
        item.setId(sc.nextInt());

        System.out.print("Enter Item Name: ");
        sc.nextLine(); // consume newline
        item.setName(sc.nextLine());

        System.out.print("Enter Item Price: ");
        item.setPrice(sc.nextDouble());

        System.out.print("Enter Category ID: ");
        category.setCategoryId(sc.nextInt());

        System.out.print("Enter Category Name: ");
        sc.nextLine(); // consume newline
        category.setCategoryName(sc.nextLine());

        System.out.println("\n🔍 Item Details:");
        item.display();
    }
}
