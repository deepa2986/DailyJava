package multithreading;

public class ThreadMain {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        //thread1.run();
        thread1.start();
        MyThread thread2 = new MyThread();
        thread2.start();
    }
}
