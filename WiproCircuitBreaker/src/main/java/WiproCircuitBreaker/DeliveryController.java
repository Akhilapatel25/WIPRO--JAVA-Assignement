package WiproCircuitBreaker;




import WiproCircuitBreaker.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/check-delivery")
    public String checkDelivery() {
        return deliveryService.getDeliveryStatus();
    }
}
