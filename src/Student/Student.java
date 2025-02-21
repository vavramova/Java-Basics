package Student;

import java.util.Random;

public class Student {
    private final String name;
    private final int grade;

    public Student(String name){
        this.name = name;
        this.grade = generateRandomGrade();
    }

    /**
     * a methode that generates a random grade for every student
     * @return the grade
     */
    private int generateRandomGrade(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    /**
     * a methode that gets the name of a student
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * a methode that gives the grade of a student
     * @return the grade
     */
    public int getGrade(){
        return grade;
    }

    /**
     * a methode that helps to print information about a student
     */
    public void printInfo(){
        System.out.println(name + " : " + grade);
    }
}
