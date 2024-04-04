
package hotel;

import java.util.Date;

public class UserDao {
    private Object room;
    private int customer;
    private Date date;
    private Object days;
    private int cost;
    private int Customer_id;
    private int idbookings;
    
    public Object getRoom() {
        return room;
    }

    public int getCustomer() {
        return customer;
    }

    public Object getDays() {
        return days;
    }

    public int getCost() {
        return cost;
    }
    
     public Date getDate() {
        return date;
    }

    public void setRoom(Object room) {
        this.room = room;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public void setDays(Object days) {
        this.days = days;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
     public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer_id(int Customer_id) {
        this.Customer_id = Customer_id;
    }

    public int getCustomer_id() {
        return Customer_id;
    }

    public int getIdbookings() {
        return idbookings;
    }

    public void setIdbookings(int idbookings) {
        this.idbookings = idbookings;
    }
    
    
    
     public static void main(String[] args) {
       
    }

}
