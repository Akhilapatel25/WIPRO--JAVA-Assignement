package WiprokafkaUberProducer;




import WiprokafkaUberProducer.DTORideRequest;
import WiprokafkaUberProducer.KafkaRideProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final KafkaRideProducer kafkaRideProducer;

    public RideController(KafkaRideProducer kafkaRideProducer) {
        this.kafkaRideProducer = kafkaRideProducer;
    }

    @PostMapping
    public String createRide(@RequestBody DTORideRequest rideRequest) {
        rideRequest.setOperation("CREATE");
        kafkaRideProducer.sendRideEvent(rideRequest);
        return "Ride creation request sent to Kafka.";
    }

    @PutMapping("/{id}")
    public String updateRide(@PathVariable Long id, @RequestBody DTORideRequest rideRequest) {
        rideRequest.setOperation("UPDATE");
        rideRequest.setId(id);
        kafkaRideProducer.sendRideEvent(rideRequest);
        return "Ride update request sent to Kafka.";
    }

    @DeleteMapping("/{id}")
    public String deleteRide(@PathVariable Long id) {
        DTORideRequest rideRequest = new DTORideRequest();
        rideRequest.setOperation("DELETE");
        rideRequest.setId(id);
        kafkaRideProducer.sendRideEvent(rideRequest);
        return "Ride deletion request sent to Kafka.";
    }

    @GetMapping("/{id}")
    public String getRide(@PathVariable Long id) {
        DTORideRequest rideRequest = new DTORideRequest();
        rideRequest.setOperation("READ");
        rideRequest.setId(id);
        kafkaRideProducer.sendRideEvent(rideRequest);
        return "Ride retrieval request sent to Kafka.";
    }
}
