package ch7;

public class EmployeeRunner {
    
    public static void main(String[] args) {
        
        Doctor doc = new Doctor("Dr. Sam");
        doc.setSalary(400000);
        System.out.println(doc);
        doc.getName();
        doc.getSalary();
        doc.curePatient();
        doc.prescribe();

        System.out.println();

        Nurse n = new Nurse("Nurse Pam");
        n.setSalary(100000);
        System.out.println(n);
        n.getName();
        n.getSalary();
        n.checkTemp();
        n.vaccinate();


    }

}
