package MockBackendApp;


//MockDeliveryApplication.java


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MockDeliveryApplication {

 public static void main(String[] args) {
     SpringApplication.run(MockDeliveryApplication.class, args);
 }

 @GetMapping("/delivery/status")
 public String getStatus() {
     return "Order is on the way!";
 }
}
