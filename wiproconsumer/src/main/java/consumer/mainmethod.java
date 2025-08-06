package consumer;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class mainmethod {
    public static void main(String[] args) {
    	 SpringApplication.run(mainmethod.class, args);
    }
}
//http://localhost:8081/restaurants
//http://localhost:8082/consumer/restaurants