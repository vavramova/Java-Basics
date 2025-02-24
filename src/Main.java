import Bank.BankAccount;
import Car.Car;
import ChainedExcp.App;
import Classes_and_Generics.Box;
import Classes_and_Generics.Container;
import Classes_and_Generics.StackContainer;
import Interfaces_and_abstract_classes.Circle;
import Interfaces_and_abstract_classes.Rectangle;
import Interfaces_and_abstract_classes.Shape;
import Library.Library;
import PersExceptions.BankAcc_Exceptions;
import PersExceptions.InvalidAgeException;
import PersExceptions.NegativeBalanceException;
import PersExceptions.UserRegistration;
import Polymorphism.Guitar;
import Polymorphism.Piano;
import Polymorphism.Playable;
import Student.Student;
import Student.StudentAdv;
import Library.Book;


import java.util.ArrayList;
import java.util.List;


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


        System.out.println("-------------------------------------");
        //Library

        Library lib = new Library();

        Book book1 = new Book("1948", "Georg Oruel");
        Book book2 = new Book("Harry Potter", "J.K.Rolling");

        lib.addBook(book1);
        lib.addBook(book2);

        lib.listOfAvailableBooks();

        lib.borrowBook("1948");

        lib.listOfAvailableBooks();

        lib.returnBook("1948");

        lib.listOfAvailableBooks();



        System.out.println("-------------------------------------");
        //Interfaces and Abstract classes
        Shape rectangle = new Rectangle<>(5.0, 10.0, "Red");
        Shape circle = new Circle<>(7.0, "Blue");

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());


        System.out.println("-------------------------------------");
        //Classes and Generics
        Container<String> box = new Box<>();
        box.addItem("Apple");
        box.addItem("Banana");

        System.out.println("Box size: " + box.size());
        System.out.println("First item in box: " + box.getItem(0));

        StackContainer<Integer> stack = new StackContainer<>();
        stack.addItem(10);
        stack.addItem(20);
        stack.addItem(30);

        System.out.println("Stack size before pop: " + stack.size());
        System.out.println("Popped item: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());



        System.out.println("-------------------------------------");
        //Polymorphism
        List<Playable> band = new ArrayList<>();
        band.add(new Guitar("Fender Stratocaster"));
        band.add(new Piano("Yamaha Grand"));

        for (Playable instrument : band) {
            instrument.play();
        }

        System.out.println("-------------------------------------");
        //PersExceptions
        BankAcc_Exceptions acc = new BankAcc_Exceptions(100);

        try{
           acc.withdraw(150);
        }catch (NegativeBalanceException nbe){
            System.out.println("Error: " + nbe.getMessage());
        }

        UserRegistration userReg = new UserRegistration();
        try{
            userReg.registerUser("Vicky" , 16);
        }catch (InvalidAgeException iae){
            System.out.println("Error: " + iae.getMessage());
        }

        try{
            userReg.registerUser("Bob", 20);
        }catch (InvalidAgeException iae){
            System.out.println("Error: " + iae.getMessage());
        }



        System.out.println("-------------------------------------");
        //ChainedExcp
        App app = new App();

        try{
            app.startApp();
        }catch(RuntimeException re){
            System.out.println("Root cause: " + re.getCause().getMessage());
        }
    }
}