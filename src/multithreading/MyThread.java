package multithreading;

public class MyThread extends Thread{

    public void run(){
        System.out.println("Hello from thread #" + Thread.currentThread().getId());
    }
}
