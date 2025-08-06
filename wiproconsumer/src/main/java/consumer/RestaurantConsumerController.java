package consumer;


import consumer.RestaurantClient;
import consumer.Restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class RestaurantConsumerController {

    @Autowired
    private RestaurantClient restaurantClient;

    @GetMapping("/restaurants")
    public List<Restaurant> fetchRestaurants() {
        return restaurantClient.getRestaurants();
    }
}
