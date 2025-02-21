import Car.Car;
import Student.Student;

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
    }
}