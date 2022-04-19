package ch7;

public class Doctor extends Employee{

    public Doctor(String n) {
        super(n);
    }

    public void curePatient(){
        System.out.println("Curing a patient");
    }

    public void prescribe(){
        System.out.println("Prescribing Medicine");
    }
    
}
