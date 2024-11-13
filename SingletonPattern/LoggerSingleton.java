package SingletonPattern;

public class LoggerSingleton {

    //variables in Java are cached in each thread's local memory. This may lead to inconsistent views of the variables value.
    //make instace volatile, so that every thread reading it always reads the most recent write.
    private static volatile LoggerSingleton instance = null;


    private LoggerSingleton() {
        //private constructors can be accessed using reflection.
        //add check in constructor itself to make sure only one instance is created.
        if (instance != null) {
            throw new RuntimeException("Not accessible");
        }
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            //adding synchronization so that only one thread can process at a time
            synchronized(LoggerSingleton.class) {
                if (instance == null) {
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
