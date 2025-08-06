package question15;

import org.springframework.data.jpa.repository.JpaRepository;
import question15.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
