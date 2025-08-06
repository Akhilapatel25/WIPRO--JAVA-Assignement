package producer;



import producer.Restaurant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return List.of(
            new Restaurant(1, "Spice Garden", "Hyderabad"),
            new Restaurant(2, "Taste Town", "Bangalore"),
            new Restaurant(3, "Foodie's Hub", "Chennai")
        );
    }
}
