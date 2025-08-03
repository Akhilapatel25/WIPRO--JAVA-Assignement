package springcore;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp8 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springaop8.xml");
        ShoppingService8 shop = (ShoppingService8) context.getBean("shop");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        shop.purchaseItems(item, qty);
    }
}
