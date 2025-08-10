package WiprokafkaUberConsumer;




/*import WiprokafkaUberConsumer.Ride;
import WiprokafkaUberConsumer.RideService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RideKafkaConsumer {

    private final RideService rideService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Value("${kafka.topic.name}")
    private String topicName;

    public RideKafkaConsumer(RideService rideService) {
        this.rideService = rideService;
    }

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {
        try {
            JsonNode node = objectMapper.readTree(message);
            String op = node.path("operation").asText(null);
            Long id = node.path("id").isMissingNode() ? null : node.path("id").asLong();

            if (op == null) {
                System.err.println("Operation missing in message: " + message);
                return;
            }

            switch (op.toUpperCase()) {
                case "CREATE":
                case "UPDATE":
                    if (id == null) {
                        System.err.println("Missing id for CREATE/UPDATE: " + message);
                        return;
                    }
                    Ride r = new Ride();
                    r.setId(id);
                    r.setDriverName(node.path("driverName").asText(null));
                    r.setPassengerName(node.path("passengerName").asText(null));
                    r.setPickupLocation(node.path("pickupLocation").asText(null));
                    r.setDropLocation(node.path("dropLocation").asText(null));
                    if (!node.path("fare").isMissingNode() && !node.path("fare").isNull()) {
                        r.setFare(node.path("fare").asDouble());
                    }
                    rideService.createOrUpdate(r);
                    System.out.println(op + " processed for id=" + id);
                    break;

                case "DELETE":
                    if (id == null) {
                        System.err.println("Missing id for DELETE: " + message);
                        return;
                    }
                    rideService.deleteById(id);
                    System.out.println("DELETE processed for id=" + id);
                    break;

                default:
                    System.err.println("Unknown operation: " + op + " message: " + message);
            }
        } catch (Exception ex) {
            System.err.println("Error parsing message: " + message);
            ex.printStackTrace();
        }
    }
}*/


import WiprokafkaUberConsumer.Ride;
import WiprokafkaUberConsumer.RideService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RideKafkaConsumer {

    private final RideService rideService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Value("${kafka.topic.name}")
    private String topicName;

    public RideKafkaConsumer(RideService rideService) {
        this.rideService = rideService;
    }

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {
        try {
            JsonNode node = parseMessage(message);

            String op = node.path("operation").asText(null);
            Long id = node.path("id").isMissingNode() ? null : node.path("id").asLong();

            if (op == null) {
                System.err.println("Operation missing in message: " + message);
                return;
            }

            switch (op.toUpperCase()) {
                case "CREATE":
                case "UPDATE":
                    if (id == null) {
                        System.err.println("Missing id for CREATE/UPDATE: " + message);
                        return;
                    }
                    Ride r = new Ride();
                    r.setId(id);
                    r.setDriverName(node.path("driverName").asText(null));
                    r.setPassengerName(node.path("passengerName").asText(null));
                    r.setPickupLocation(node.path("pickupLocation").asText(null));
                    r.setDropLocation(node.path("dropLocation").asText(null));
                    if (!node.path("fare").isMissingNode() && !node.path("fare").isNull()) {
                        r.setFare(node.path("fare").asDouble());
                    }
                    rideService.createOrUpdate(r);
                    System.out.println(op + " processed for id=" + id);
                    break;

                case "DELETE":
                    if (id == null) {
                        System.err.println("Missing id for DELETE: " + message);
                        return;
                    }
                    rideService.deleteById(id);
                    System.out.println("DELETE processed for id=" + id);
                    break;

                default:
                    System.err.println("Unknown operation: " + op + " message: " + message);
            }
        } catch (Exception ex) {
            System.err.println("Error parsing message: " + message);
            ex.printStackTrace();
        }
    }

    /**
     * Parse the message — handles both normal JSON and escaped JSON.
     */
    private JsonNode parseMessage(String message) throws Exception {
        JsonNode node = objectMapper.readTree(message);

        // If the message is actually a quoted JSON string, parse it again
        if (node.isTextual()) {
            node = objectMapper.readTree(node.asText());
        }
        return node;
    }
}

