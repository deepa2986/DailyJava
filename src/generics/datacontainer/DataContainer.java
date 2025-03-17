package generics.datacontainer;

public class DataContainer<T>{

    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "value=" + value +
                '}';
    }
}
