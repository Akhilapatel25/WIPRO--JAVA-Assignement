package WiprokafkaUberProducer;




import WiprokafkaUberProducer.DTORideRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaRideProducer {

    @Value("${kafka.topic.name}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public KafkaRideProducer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendRideEvent(DTORideRequest rideRequest) {
        try {
            String jsonMessage = objectMapper.writeValueAsString(rideRequest);
            kafkaTemplate.send(topicName, jsonMessage);
            System.out.println("Sent to Kafka: " + jsonMessage);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error serializing RideRequest", e);
        }
    }
}
