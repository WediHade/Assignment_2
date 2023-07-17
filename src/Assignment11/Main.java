package Assignment11;

import java.util.*;
public class Main {

    public static List<String> getTopStudents(Map<String, Integer> grades) {
        List<String> topPerformers = new ArrayList<>();

        // Find the highest grade
        int highestGrade = Integer.MIN_VALUE;
        for (int grade : grades.values()) {
            highestGrade = Math.max(highestGrade, grade);
        }

        // Retrieve the top-performing students' names
        for (String student : grades.keySet()) {
            if (grades.get(student) == highestGrade) {
                topPerformers.add(student);
            }
        }

        return topPerformers;
    }

    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 76);
        studentGrades.put("David", 92);
        studentGrades.put("Eve", 88);
        studentGrades.put("Frank", 85);

        List<String> topStudents = getTopStudents(studentGrades);
        System.out.println("Top-performing students: " + topStudents);
    }
}