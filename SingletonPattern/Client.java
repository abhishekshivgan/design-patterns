package SingletonPattern;

public class Client {
    public static void main(String[] args) {
        LoggerSingleton singletonObj1 = LoggerSingleton.getInstance();
        System.out.println(singletonObj1);

        LoggerSingleton singletonObj2 = LoggerSingleton.getInstance();
        System.out.println(singletonObj2);

        //Here references for both the objects will be same
    }
}
