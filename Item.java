import java.util.Date;

public class Item {
    private final String title ;

    private final String genre ;

    private final Date release_date ;

    private int id ;

    private final int rental_fee ;

    private boolean available ;

// constructor
    public Item(String title , String genre , Date release_date , int id , int rental_fee ){

        this.title = title ;

        this.genre = genre ;

        this.release_date = release_date ;

        this.id = id;

        this.rental_fee = rental_fee ;

        this.available = true ;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public int getId() {
        return id;
    }

    public int getRental_fee() {
        return rental_fee;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentItem(Customer customer){}

}


