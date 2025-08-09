package WiproSpringZipkinOrderService;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/order")
    public String placeOrder(RestTemplate restTemplate) {
        String paymentResponse = restTemplate.getForObject("http://localhost:8082/payment", String.class);
        return "Order placed successfully. Payment status: " + paymentResponse;
    }
}

