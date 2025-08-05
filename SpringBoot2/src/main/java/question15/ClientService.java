package question15;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    void saveClient(Client client);
    Client getClientById(Long id);
    void deleteClient(Long id);
}
