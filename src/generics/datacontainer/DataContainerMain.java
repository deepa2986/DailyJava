package generics.datacontainer;

public class DataContainerMain {

    public static void main(String[] args) {

        DataContainer<String> stringDataContainer = createStringDataContainer();
        System.out.println(stringDataContainer);

    }

    public static DataContainer<String> createStringDataContainer(){
         return new DataContainer<>("Hello");
    }
}
