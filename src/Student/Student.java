package Student;

import java.util.Random;

public class Student {
    private final String name;
    private int grade;

    public Student(String name){
        this.name = name;
        this.grade = generateRandomGrade();
    }

    private int generateRandomGrade(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public void printInfo(){
        System.out.println(name + " : " + grade);
    }
}
