package Polymorphism;

public class Piano extends Instrument{

    public Piano(String name){
        super(name);
    }


    @Override
    public void play() {
        System.out.println(name + " is playing Piano");
    }
}
