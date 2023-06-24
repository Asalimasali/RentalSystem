import java.util.Date;

public class Game extends Item{

    private final String platform ;
    private final String publisher ;

    //constructor

    public Game (String title , String genre , Date release_date , int id , int rental_fee , String platform , String publisher) {
        super(title, genre, release_date, id, rental_fee);

        this.platform = platform ;

        this.publisher = publisher ;

    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void rentItem(Customer customer) {
        //dige qabel rent nist
        this.setAvailable(false);
        Rental rental = new Rental(this , customer , Integer.parseInt(customer.getId() + String.valueOf(this.getId())));

        customer.getRentals().add(rental);
        System.out.println("Game rented!");

    }


}
