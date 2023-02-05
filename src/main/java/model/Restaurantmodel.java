package model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Restaurantmodel {

    private int restaurantid ;
    private String Name ;

    private String type ;  // like veg , Nonveg , veg&Nonveg

    private String Contactno ;


    private String address ;

    public int getRestaurantid() {
        return restaurantid;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return type;
    }

    public String getContactno() {
        return Contactno;
    }

    public String getAddress() {
        return address;
    }


    public void setRestaurantid(int restaurantid) {
        this.restaurantid = restaurantid;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContactno(String contactno) {
        Contactno = contactno;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
