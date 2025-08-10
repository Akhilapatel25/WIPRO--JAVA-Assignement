package WiprokafkaUberConsumer;




import WiprokafkaUberConsumer.Ride;
import WiprokafkaUberConsumer.RideService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideDebugController {

    private final RideService rideService;

    public RideDebugController(RideService rideService) {
        this.rideService = rideService;
    }

    @GetMapping
    public List<Ride> allRides() {
        return rideService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ride> getRide(@PathVariable Long id) {
        Ride r = rideService.findById(id);
        if (r == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(r);
    }
}
