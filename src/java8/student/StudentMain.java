package java8.student;

import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = StudentRepository.getAllStudents();
        String major = "Computer Science";
        int highestGrade = highestGradeWithSpecificMajor(students, major);
        System.out.println(highestGrade);


    }

    public static int highestGradeWithSpecificMajor(List<Student> students, String major){
        return students
                .stream()
                .filter(s -> major.equals(s.getMajor()))
                .flatMap(s -> s.getGrades().values().stream())
                .max(Integer::compareTo).orElseGet(() -> 0);

    }
}
