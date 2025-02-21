package Student;

import java.util.ArrayList;
import java.util.Random;

public class StudentAdv {
    String name;
    int age;
    double grade;

    public StudentAdv(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = generateRandomGrade();
    }

    private double generateRandomGrade(){
        Random random = new Random();
        return 2.0 + random.nextDouble() * 5.0;
    }

    public static ArrayList<StudentAdv> filter(ArrayList<StudentAdv> students){
        ArrayList<StudentAdv> filteredStud = new ArrayList<>();

        for(StudentAdv student : students){
            if(student.grade <= 3.0){
                continue;
            }

            if(student.age >= 18 && student.grade >= 4.00){
                filteredStud.add(student);
            }
        }

        return filteredStud;
    }

    public void printInfo() {
        System.out.printf("Name: %s, Age: %d, Grade: %.2f\n", name, age, grade);
    }

}
