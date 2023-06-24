import java.util.Date;

public class Movie extends Item {

    private final String director ;
    private final String cast;

//constructor
    public Movie(String title, String genre, Date release_date, int id, int rental_fee , String director , String cast) {
        super(title, genre, release_date, id, rental_fee);

        this.director = director ;

        this.cast = cast ;

    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public void rentItem(Customer customer) {
        //dige qabel rent nist
        this.setAvailable(false);
        Rental rental = new Rental(this , customer , Integer.parseInt(customer.getId() + String.valueOf(this.getId())));

        customer.getRentals().add(rental);
        System.out.println("Movie rented!");

    }

}
