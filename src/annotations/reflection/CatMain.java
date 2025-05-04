package annotations.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatMain {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Bella",4);
        Field[] declaredFields = cat.getClass().getDeclaredFields();
        for(Field field : declaredFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(cat,"Jill");
            }
            //  System.out.println(field.getName());
        }
        //  cat.setName("jill");
      //  System.out.println(cat.getName());

        Method[] declaredMethods = cat.getClass().getDeclaredMethods();
        for(Method method : declaredMethods) {
            if (method.getName().equals("thisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(cat);
                //  cat.printMeow();
            }
            if (method.getName().equals("publicStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
                // System.out.println(method.getName());
            }

            if(method.getName().equals("privateStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
