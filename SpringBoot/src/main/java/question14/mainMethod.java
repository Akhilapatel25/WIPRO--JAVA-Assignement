package question14;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class mainMethod {
    public static void main(String[] args) {
        SpringApplication.run(mainMethod.class, args);
    }
}

//http://localhost:8080/SpringBoot/api/restaurants/idnumber

//http://localhost:8080/SpringBoot/api/restaurants/7/food==>add food 
//http://localhost:8080/actuator
