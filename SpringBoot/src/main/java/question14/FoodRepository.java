package question14;




import org.springframework.data.jpa.repository.JpaRepository;
import question14.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
