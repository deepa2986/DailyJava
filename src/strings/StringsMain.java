package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsMain {

    public static void main(String[] args) {

        String firstName = " sarang";
        String lastName = " dia   ";
        String name = firstName + " " +lastName;
        String concat = firstName.concat(" ").concat(lastName);
        System.out.println(concat);

        StringBuilder builder = new StringBuilder("abd");
        builder.append("ert").append("ghi").insert(0,"123");
        System.out.println(builder);


        builder.delete(3,6);
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer("lolo");
        buffer.append("mki").append("dsa").insert(2,"mjh");
        System.out.println(buffer);

        buffer.delete(4,5);
        System.out.println(buffer);

        String panda = "   Panda";
        String horse = "   Horse ";
        String fish = " Fish ";
        String nothing  = " ";

        List<String> animals = List.of(panda,horse,fish,nothing);
        System.out.println(animals);

        animals
                .stream()
                .forEach(s -> System.out.println(s.trim()));

        List<String> trimmedList = animals
                .stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());
        System.out.println(trimmedList);

        List<String> animalsFiltered = trimmedList
                .stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(animalsFiltered);

        List<String> animalNames = animalsFiltered
                .stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(animalNames);




    }
}
