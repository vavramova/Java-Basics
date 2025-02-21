import Car.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car("BMW", 340);
        myNewCar.accelerate(50);
        myNewCar.printStatus();
        myNewCar.accelerate(300);
        myNewCar.printStatus();
        myNewCar.brake(30);
        myNewCar.printStatus();
        myNewCar.brake(310);
        myNewCar.printStatus();

    }
}