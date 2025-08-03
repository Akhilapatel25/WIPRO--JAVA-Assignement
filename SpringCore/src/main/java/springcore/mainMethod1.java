package springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("springcore")
public class mainMethod1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(mainMethod1.class);

        PropertyLoader loader = context.getBean(PropertyLoader.class);

        System.out.println("URL      : " + loader.getUrl());
        System.out.println("Username : " + loader.getUsername());
        System.out.println("Password : " + loader.getPassword());

        context.close();
    }
}
