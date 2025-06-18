package Exercise_1_Singleton_Implementation;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

class ThreadTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + singleton.hashCode());
        };
        Thread thread1 = new Thread(task,"Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }
}

