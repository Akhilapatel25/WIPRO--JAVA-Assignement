package question14;


import org.springframework.data.jpa.repository.JpaRepository;
import question14.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
