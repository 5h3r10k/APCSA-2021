package ch4;

public class CourseRunner {
    
    public static void main(String[] args) {
        Address School = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);
		
		Address JHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
		Address MHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
		
		Student John = new Student ("John", "Smith", JHome, School,100,95,90);
		Student Marsha = new Student ("Marsha", "Jones", MHome, School);

        Course physics = new Course("AP Physics C");
        physics.addStudent(John);
        physics.addStudent(Marsha);
        physics.roll();
        System.out.println("Class average: "+physics.average());
    }

}
