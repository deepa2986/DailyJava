package multithreading;

public class SynchronizedExample {
    private int counter = 0;

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        example.increment();
        example.increment();
        int counter1 = example.counter;
        System.out.println(counter1);
    }


    public synchronized void increment(){
        counter++;
        System.out.println(counter);
    }
}
