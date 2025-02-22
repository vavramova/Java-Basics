package Polymorphism;

public class Guitar extends Instrument{

    public Guitar(String name){
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing Guitar");
    }
}
