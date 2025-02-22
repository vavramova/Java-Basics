package Polymorphism;

public abstract class Instrument implements Playable {
    protected String name;

    public Instrument(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
