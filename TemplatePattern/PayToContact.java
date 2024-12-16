package TemplatePattern;

public class PayToContact extends PaymentFlow {
    double fees = 0.0;

    @Override
    public void validateRequest(String receiver) {
        //validation logic
        System.out.println("Contact validated");
    }

    @Override
    public void debitAmount(String sender, double amount) {
        // debit money logic
        System.out.println(amount + " Rs. debited from " + sender);
    }

    @Override
    public void calculateFees(double amount) {
        // fee calculation logic
       System.out.println("No fees added");
    }

    @Override
    public void creditAmount(String receiver, double amount) {
        System.out.println(amount + " Rs. credeited to " + receiver);
        System.out.println();
    }
}
