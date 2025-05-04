package cheatcode;

public class ToStringDemo {

    private String name;
    private int age;

    public ToStringDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "ToStringDemo{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';

        return String.format("Answer{name='%s', age=%d}", name, age);
    }

    public  static ToStringDemo result(String name, int age){
        ToStringDemo stringDemo = new ToStringDemo(name,age);
        return stringDemo;
    }


    public static void main(String[] args) {

        String name = "april";
        int age = 43;
        ToStringDemo result = result(name, age);
        System.out.println(result);

    }
}
