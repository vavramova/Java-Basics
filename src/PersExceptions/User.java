package PersExceptions;

public class User {
    private final int age;

    public User(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("User must be at least 18");
        }

        this.age = age;
    }




}
