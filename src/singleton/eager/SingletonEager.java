package singleton.eager;

public final class SingletonEager {

    public static final SingletonEager instance = new SingletonEager();
    private SingletonEager(){
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
