package multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello multithreading from thread #" + Thread.currentThread().getId());
    }
}
