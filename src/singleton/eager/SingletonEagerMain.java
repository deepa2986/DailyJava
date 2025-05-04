package singleton.eager;

public class SingletonEagerMain {

    public static void main(String[] args) {

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager.hashCode());

        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager1.hashCode());

        SingletonEager instance = SingletonEager.getInstance();
        System.out.println(instance.hashCode());

    }
}
