package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Runnable task = () -> System.out.println("Hello from executor on thread "+ Thread.currentThread().getId());
        for(int i = 0; i < 10; i++){
            service.execute(task);
        }
        service.shutdown();
    }
}
