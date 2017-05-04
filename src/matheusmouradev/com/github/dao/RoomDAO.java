
package matheusmouradev.com.github.dao;

import java.util.ArrayList;
import java.util.List;
import matheusmouradev.com.github.data.Room;
import org.hibernate.Session;

/**
 *
 * @author Matheus
 */
public class RoomDAO {
    
    public void create(Room r) {
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        se.save(r);
        
        se.getTransaction().commit();
    }
    
    public List<Room> read() {
        List<Room> listRoom = new ArrayList<>();
        
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        listRoom = se.createQuery("from Room").list();
        
        se.getTransaction().commit();
        
        return listRoom;
    }
    
    public void update(Room r) {
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        se.update(r);
        
        se.getTransaction().commit();
    }
    
    public void delete(Room r) {
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        se.delete(r);
        
        se.getTransaction().commit();
    }
}
