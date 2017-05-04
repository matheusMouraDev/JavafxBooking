package matheusmouradev.com.github.data;
// Generated 21/04/2017 11:17:06 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client  implements java.io.Serializable {

    @Id
    private Integer id;
    
    @Column
    private String name;

    @Column
    @ManyToOne
    @JoinColumn(name = "number")
    private Room room;
    
    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


