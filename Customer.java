import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name ;
    private final String email;
    private final String phone;
    private final String address;
    private final int id;
    private final List<Rental> rentals;


    public Customer(String name , String email , String phone , String address , int id) {

        this.name = name;
        this.email= email;
        this.phone = phone;
        this.address = address;
        this.id = id;
        this.rentals = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public List<Rental> getRentals() {
        return rentals;
    }
}
