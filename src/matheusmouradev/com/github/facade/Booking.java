
package matheusmouradev.com.github.facade;

import java.util.List;
import matheusmouradev.com.github.business.*;
import matheusmouradev.com.github.data.Client;
import matheusmouradev.com.github.data.Room;

public class Booking {
    private RegisterClient registerClient;
    private RegisterRoom registerRoom;

    public Booking() {
        this.registerClient = new RegisterClient();
        this.registerRoom = new RegisterRoom();
    }
  
    //Client Methods
    public void createClient(Client c) {
        this.registerClient.createClient(c);
    }
    
    public List<Client> readClient() {
        return this.registerClient.readClient();
    }
    
    public void updateClient(Client c) {
        this.registerClient.updateClient(c);
    }
    
    public void deleteClient(Client c) {
        this.registerClient.deleteClient(c);
    }
    
    //Room Methods
    public void createRoom(Room r) {
        this.registerRoom.createRoom(r);
    }
    
    public List<Room> readRoom() {
       return this.registerRoom.readRoom();
    }
    
    public void updateRoom(Room r) {
        this.registerRoom.updateRoom(r);
    }
    
    public void deleteRoom(Room r) {
        this.registerRoom.deleteRoom(r);
    }
}
