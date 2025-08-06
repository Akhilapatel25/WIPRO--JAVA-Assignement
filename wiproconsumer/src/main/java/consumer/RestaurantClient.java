package consumer;




import consumer.Restaurant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "wiproproducer")
public interface RestaurantClient {
    @GetMapping("/restaurants")
    List<Restaurant> getRestaurants();
}
