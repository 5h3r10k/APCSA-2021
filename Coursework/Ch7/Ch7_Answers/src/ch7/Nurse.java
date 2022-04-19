package ch7;

public class Nurse extends Employee {

    public Nurse(String n) {
        super(n);
    }
    
    public void vaccinate(){
        System.out.println("Administering vaccine...");
    }

    public void checkTemp(){
        System.out.println("Checking temperature...");
    }

}
