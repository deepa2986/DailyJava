package multithreading;

import java.util.concurrent.*;

public class FutureCallableExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };
        Future<Integer> future = executor.submit(task);

        try {
            Integer result = future.get();
            System.out.println("Result : " + result);
        } catch (InterruptedException  | ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}
