package strings;

import java.util.Arrays;

public class StringText {

    public static void main(String[] args) {

        String text = "Java is a widely used, general-purpose, class-based, object-oriented programming language. " +
                "It's known for its platform independence, meaning code written in Java can run on any device " +
                "that supports the Java Virtual Machine (JVM). " +
                "This \"Write Once, Run Anywhere\" capability, along with its robustness and memory management," +
                " makes it a popular choice for developers worldwide. ";

        String[] sentences = text.split("\\.");
        System.out.println("text has " + sentences.length + "sentences");

        String[] words = text.split(" |-");
        System.out.println(words.length);

        System.out.println(Arrays.asList(words));

        int totalCharsInText = text.length();
        System.out.println(totalCharsInText);


    }
}
