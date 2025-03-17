package reflection;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMeow(){
        System.out.println("Meow");
    }

    private void thisIsPrivate(){
        System.out.println("Calling private!!");
    }

    public static void publicStaticMethod(){
        System.out.println("this is public static method");
    }

    private static void privateStaticMethod(){
        System.out.println("this is private static method");
    }

}
