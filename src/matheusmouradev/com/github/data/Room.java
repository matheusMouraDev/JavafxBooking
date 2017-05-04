package matheusmouradev.com.github.data;
// Generated 21/04/2017 11:17:06 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="room")
public class Room  implements java.io.Serializable {

    @Id
    private Integer number;
    
    @Column
    private String description;
    
    @Column
    private byte situation;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date bookDate;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date enterDate;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date exitDate;
    
    @Column
    private float dailyAmount;

    public Room() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getSituation() {
        return situation;
    }

    public void setSituation(byte situation) {
        this.situation = situation;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public float getDailyAmount() {
        return dailyAmount;
    }

    public void setDailyAmount(float dailyAmount) {
        this.dailyAmount = dailyAmount;
    }

}


