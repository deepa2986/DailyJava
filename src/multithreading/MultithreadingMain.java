package multithreading;

public class MultithreadingMain {

    public static void main(String[] args) {
        System.out.println("This is thread #" + Thread.currentThread().getId());
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
