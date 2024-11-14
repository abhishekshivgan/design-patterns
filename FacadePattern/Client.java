package FacadePattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        
        System.out.println("Enter your email:");
        String email = sc.next();
        sc.nextLine(); 

        System.out.println("Enter your phone No:");
        String phone = sc.next();
        sc.nextLine(); 
        User user = new User(name, email, phone);

        MovieManager.getMovies();
        System.out.println("Enter movie no:");
        int movieNo = sc.nextInt();
        Movie movie = MovieManager.getMovie(movieNo);

        Booking booking = BookingFacade.createBooking(user, movie);

        if (booking != null) {
            System.out.println("Your booking is confirmed. Here are the details");
            System.out.println(booking);
        }
        

        sc.close();
    }
}
