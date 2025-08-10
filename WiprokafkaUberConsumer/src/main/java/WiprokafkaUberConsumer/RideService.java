package WiprokafkaUberConsumer;




import WiprokafkaUberConsumer.Ride;
import WiprokafkaUberConsumer.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {
    private final RideRepository repo;

    public RideService(RideRepository repo) {
        this.repo = repo;
    }

    public Ride createOrUpdate(Ride ride) {
        return repo.save(ride);
    }

    public void deleteById(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        }
    }

    public List<Ride> findAll() {
        return repo.findAll();
    }

    public Ride findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
