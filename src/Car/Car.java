package Car;

public class Car {


    /**
     * The attributes of the car are brand, current speed and maximum speed
     */
    private String brand;
    private int speed;
    private int maxSpeed;

    /**
     * Constructor that creates new Object Car with current speed 0
     * @param brand sets the car brand
     * @param maxSpeed sets the maximum speed of the car
     */
    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    /**
     * A method that increases the speed of the car
     * @param amount
     */
    public void accelerate(int amount){
        if((speed + amount) >= maxSpeed){
            speed = maxSpeed;
        }else{
            speed += amount;
        }
    }

    /**
     * A method that decreases the speed of the car
     * @param amount
     */
    public void brake(int amount){
        if((speed - amount) <= 0){
            speed = 0;
        }else {
            speed -= amount;
        }
    }

    /**
     * A method that helps to print the current status of the car
     */
    public void printStatus(){
        System.out.println("Your car " + brand + " is moving with " + speed + " km/h");
    }

}
