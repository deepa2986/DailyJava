package annotations;

@MyCustomAnnotation(priority = 2,tags = {"important","feature"})
public class Info {

    @MyCustomAnnotation(tags = {"details"})
    public void getDetailedInfo(){
        System.out.println("Giving important details...");
    }
}
