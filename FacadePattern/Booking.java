package FacadePattern;

import java.util.Random;

public class Booking {
    private String movie;
    private String bookingName;
    private String contact;
    private String email;
    private int ticketId;
    private boolean isConfirmed;
    private double ticketPrice;
    
    public Booking(Movie movie, User user) {
        this.movie = movie.getTitle();
        bookingName = user.getName();
        contact = user.getPhoneNo();
        email = user.getEmail();
        this.ticketId = ticketId();
        ticketPrice = movie.getPrice();
        isConfirmed = true;
    }


    @Override
    public String toString() {
        return "Booking [movie=" + movie + ", bookingName=" + bookingName + ", contact=" + contact + ", email=" + email
                + ", ticketId=" + ticketId + ", ticketPrice=" + ticketPrice + "]";
    }


    private static int ticketId() {
        Random r = new Random();
        int id = r.nextInt(100, 999);
        return id;
    }

    public String getMovie() {
        return movie;
    }

    public String getBookingName() {
        return bookingName;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public int getTicketId() {
        return ticketId;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    
}
