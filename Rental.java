import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {

    private final Item item ;
    private Customer customer ;
    private final int id;
    private final Date rental_date;
    private Date return_date;

    //constructor
    public Rental(Item item , Customer customer , int id ){
        this.item = item ;
        this.customer = customer ;
        this.id = id ;
        this.rental_date = new Date();
        this.return_date = new Date(rental_date.getTime()+ TimeUnit.DAYS.convert(Duration.ofDays(7)));

    }

    public Item getItem() {
        return item;
    }

    public Customer getCustomer() {

       return customer;
    }

    public int getId() {
        return id;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
