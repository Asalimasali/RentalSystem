import java.util.ArrayList;
import java.util.List;
public class RentalStore {
    private List<Customer> customers ;
    private List<Item> items ;
    private List<Item> availableItems;

    //constructor
    public RentalStore() {
        this.customers = new ArrayList<>();
        this.items = new ArrayList<>();
        this.availableItems = new ArrayList<>();
    }

    public void register (Customer customer){
        this.customers.add(customer);
    }
    public void addItem(Item item){
        this.items.add(item);
        availableItems.add(item);
    }

    public void removeItem (Item item){
        this.items.remove(item);
        this.availableItems.remove(item);
    }

    public List<Item> getAvailableItems() {
        return availableItems;
    }

    public Customer getCustomerById(int id){
        for(Customer customer: customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }
    public Item getItemById(int id){
        for(Item item: items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void rentItem (Item item , Customer customer){
        for (Item item1: items) {
            if(item1 == item){
                item.rentItem(customer);
                this.availableItems.remove(item);
            }
        }
    }

    public void returnItem(Rental rental){
        if(rental.getCustomer().getRentals().contains(rental)){
            rental.getItem().rentItem(rental.getCustomer());
            availableItems.add(rental.getItem());
        }
    }
}
