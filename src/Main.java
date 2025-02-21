import Bank.BankAccount;
import Car.Car;
import Student.Student;
import Student.StudentAdv;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //testing Car
        Car myNewCar = new Car("BMW", 340);
        myNewCar.accelerate(50);
        myNewCar.printStatus();
        myNewCar.accelerate(300);
        myNewCar.printStatus();
        myNewCar.brake(30);
        myNewCar.printStatus();
        myNewCar.brake(310);
        myNewCar.printStatus();

        System.out.println("-------------------------------------");
        //testing Student
        Student[] students = {
                new Student("Bob"),
                new Student("Tina"),
                new Student("Vicky")
        };

        System.out.println("Student Grades: ");
        for(Student student : students){
            student.printInfo();
        }

        int bestIdx = 0;
        int i = 1;
        while (i < students.length){
            if(students[i].getGrade() > students[bestIdx].getGrade()){
                bestIdx = i;
            }

            i++;
        }

        System.out.println("Best student: " + students[bestIdx].getName() + " with grade: " + students[bestIdx].getGrade());

        System.out.println("-------------------------------------");
        //Bank
        BankAccount owner1 = new BankAccount("Tina", 1000);
        BankAccount owner2 = new BankAccount("Vicky", 500);

        owner2.deposit(50);

        owner1.withdraw(400);

        owner1.transfer(owner2, 20);

        owner1.printInfo();
        owner2.printInfo();


        System.out.println("-------------------------------------");
        //StudentAdv
        ArrayList<StudentAdv> studs = new ArrayList<>();

        studs.add(new StudentAdv("Vicky", 20));
        studs.add(new StudentAdv("Tina", 19));
        studs.add(new StudentAdv("Maria", 17));
        studs.add(new StudentAdv("Anna", 18));
        studs.add(new StudentAdv("Irina", 16));

        ArrayList<StudentAdv> filtered = StudentAdv.filter(studs);

        System.out.println("Filtered students: ");
        for(StudentAdv student : filtered){
            student.printInfo();
        }

    }
}