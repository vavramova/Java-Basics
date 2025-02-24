package PersExceptions;

public class UserRegistration {
    public void registerUser(String name, int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("User must be at least 18 to register");
        }

        System.out.println("User registered: " + name);
    }
}
