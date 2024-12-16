package TemplatePattern;

public abstract class PaymentFlow {
    public abstract void validateRequest(String receiver);
    public abstract void debitAmount(String sender, double amount);
    public abstract void calculateFees(double amount);
    public abstract void creditAmount(String receiver, double amount);

    public final void sendMoney(String sender, String receiver, double amount) {
        validateRequest(receiver);

        calculateFees(amount);

        debitAmount(sender, amount);

        creditAmount(receiver, amount);
    }
}