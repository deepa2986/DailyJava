package java8.student;

import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String major;
    private Map<String,Integer> grades;

    public Student(String firstName, String lastName, String major, Map<String, Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }
}
