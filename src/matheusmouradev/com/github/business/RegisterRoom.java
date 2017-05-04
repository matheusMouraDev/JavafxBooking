
package matheusmouradev.com.github.business;

import java.util.List;
import matheusmouradev.com.github.dao.RoomDAO;
import matheusmouradev.com.github.data.Room;

public class RegisterRoom {

    private RoomDAO roomDAO;
    
    public RegisterRoom() {
        this.roomDAO = new RoomDAO();
    }
    
    public void createRoom(Room r) {
        this.roomDAO.create(r);
    }
    
    public List<Room> readRoom() {
       return this.roomDAO.read();
    }
    
    public void updateRoom(Room r) {
        this.roomDAO.update(r);
    }
    
    public void deleteRoom(Room r) {
        this.roomDAO.delete(r);
    }
    
}
