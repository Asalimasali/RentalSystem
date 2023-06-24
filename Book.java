import java.util.Date;

public class Book extends Item{

    private final String author ;

    private final String publisher ;

    public Book(String title , String genre , Date relase_date , int id , int rental_fee , String author , String publisher ){
        super(title , genre , relase_date , id , rental_fee );

        this.author = author ;

        this.publisher = publisher ;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void rentItem(Customer customer) {
        //dige qabel rent nist
        this.setAvailable(false);
        Rental rental = new Rental(this , customer , Integer.parseInt(customer.getId() + String.valueOf(this.getId())));

        customer.getRentals().add(rental);
        System.out.println("Book rented!");
    }

}
