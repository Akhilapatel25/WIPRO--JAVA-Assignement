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
            new Restaurant(1, "Aroma", "Hyderabad"),
            new Restaurant(2, "Raju Gari Thota", "Hyderabad"),
            new Restaurant(3, "Peacock", "Karimnagar")
        );
    }
}

