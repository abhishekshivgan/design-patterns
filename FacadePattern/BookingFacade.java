package FacadePattern;

public class BookingFacade {
    public static Booking createBooking(User user, Movie movie) {
        Payment p = new Payment();
        Booking b = null;
        if (p.makePayment(movie.getPrice())) {
            b = new Booking(movie, user);

            Notification n = new Notification();
            n.sendToEmail(b);
            n.sendToPhone(b);
        } else {
            System.out.println("payment failed. try again");
        }

        
        
        return b;
    }
}
