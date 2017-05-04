
package matheusmouradev.com.github.dao;

import java.util.ArrayList;
import java.util.List;
import matheusmouradev.com.github.data.Client;
import org.hibernate.Session;

/**
 *
 * @author Matheus
 */
public class ClientDAO {
    
    public void create(Client c) {
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        se.save(c);
        
        se.getTransaction().commit();
        
    }
    
    public List<Client> read() {
        List<Client> listClient = new ArrayList<>();
        
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        listClient = se.createQuery("from Room").list();
        
        se.getTransaction().commit();
        
        return listClient;
    }
    
    public void update(Client c) {
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        se.update(c);
        
        se.getTransaction().commit();
    }
    
    public void delete(Client c) {
        Session se = HibernateUtil.getSessionFactory().getCurrentSession();
        se.beginTransaction();
        
        se.delete(c);
        
        se.getTransaction().commit();
    }
    
    
}
