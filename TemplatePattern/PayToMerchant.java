package TemplatePattern;

public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateRequest(String receiver) {
        //validation logic
        System.out.println("Merchant validated");
    }

    @Override
    public void calculateFees(double amount) {
        //fee calculation logic
        System.out.println("2% charged");
    }

    @Override
    public void debitAmount(String sender, double amount) {
        //debit money logic
        System.out.println(amount + " Rs. debited from " + sender);
    }

    @Override
    public void creditAmount(String receiver, double amount) {
        //credit money logic
        System.out.println(amount + " Rs. debited to " + receiver);
        System.out.println();
    }
    
}
