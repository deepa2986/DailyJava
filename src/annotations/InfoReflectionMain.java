package annotations;

import java.lang.reflect.Method;
import java.util.Arrays;

public class InfoReflectionMain {

    public static void main(String[] args) {
        Class<Info> infoClassData = Info.class;
        if(infoClassData.isAnnotationPresent(MyCustomAnnotation.class)){
            MyCustomAnnotation annotation = infoClassData.getAnnotation(MyCustomAnnotation.class);
            System.out.println(annotation.priority());
            System.out.println(Arrays.toString(annotation.tags()));
        }

        for (Method method : infoClassData.getDeclaredMethods()){
            if(method.isAnnotationPresent(MyCustomAnnotation.class)){
                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                System.out.println("Method : " + method.getName());
                System.out.println("Priority : " + annotation.priority());
                System.out.println("Tags : " + Arrays.toString(annotation.tags()));

            }
        }
    }
}
