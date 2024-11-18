package ObserverPattern;

public class YouTube {
    public static void main(String[] args) {
        Channel marvel = new Channel();

        Subscriber s1 = new Subscriber("Abhishek");
        Subscriber s2 = new Subscriber("Siddhant");
        Subscriber s3 = new Subscriber("Sourabh");
        Subscriber s4 = new Subscriber("Tushar");
        Subscriber s5 = new Subscriber("Rutik");

        marvel.subscribe(s1);
        marvel.subscribe(s2);
        marvel.subscribe(s3);
        marvel.subscribe(s4);
        marvel.subscribe(s5);

        s1.subscribeChannel(marvel);
        s2.subscribeChannel(marvel);
        s3.subscribeChannel(marvel);
        s4.subscribeChannel(marvel);
        s5.subscribeChannel(marvel);

        marvel.upload("Avengers: Secret Wars trailer");
    }
}
