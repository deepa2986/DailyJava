package java8.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StudentRepository {

    public static List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student("Amine", "Ousmane", "Computer Science",
                        Map.of("Algorithms", 90, "Data Structures", 80, "Calculus", 85)),
                new Student("Lily-Ann", "Smith", "Mathematics",
                        Map.of("Algorithms", 80, "Data Structures", 75, "Calculus", 88)),
                new Student("Li", "Wei", "Computer Science",
                        Map.of("Algorithms", 92, "Data Structures", 89, "Calculus", 88)),
                new Student("Jessica", "Rodriguez", "Mathematics",
                        Map.of("Algorithms", 85, "Data Structures", 80, "Calculus", 89)));
        return students;
    }
}
