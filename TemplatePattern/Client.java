package TemplatePattern;

public class Client {
    public static void main(String[] args) {
        PaymentFlow payment1 = new PayToContact();
        payment1.sendMoney("Abhishek", "Siddhant", 100.00);

        PaymentFlow payment2 = new PayToMerchant();
        payment2.sendMoney("Abhishek", "Sourabh", 10000.00);
    }
}
