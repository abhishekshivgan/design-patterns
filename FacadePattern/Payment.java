package FacadePattern;

public class Payment {

    public boolean makePayment(double price) {
        // Logic to accept the payment
        // return false if payment fails
        System.out.println("Payment of " + price + " Rs. received.");
        return true;
    }
}
