
package matheusmouradev.com.github.business;

import java.util.List;
import matheusmouradev.com.github.dao.ClientDAO;
import matheusmouradev.com.github.data.Client;

public class RegisterClient {
    
    private ClientDAO clientDAO;

    public RegisterClient() {
        this.clientDAO = new ClientDAO();
    }
    
    public void createClient(Client c) {
        this.clientDAO.create(c);
    }
    
    public List<Client> readClient() {
        return this.clientDAO.read();
    }
    
    public void updateClient(Client c) {
        this.clientDAO.update(c);
    }
    
    public void deleteClient(Client c) {
        this.clientDAO.delete(c);
    }
}
