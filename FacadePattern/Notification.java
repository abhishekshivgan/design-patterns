package FacadePattern;

public class Notification {
    
    public void sendToEmail(Booking booking) {
        System.out.println("Your ticket of movie " + booking.getMovie() + " has been sent to " + booking.getEmail());
    }

    public void sendToPhone(Booking booking) {
        System.out.println("Your ticket of movie " + booking.getMovie() + " has been sent to " + booking.getContact());   
    }
}
