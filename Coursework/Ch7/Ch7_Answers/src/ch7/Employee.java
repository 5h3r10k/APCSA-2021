package ch7;

public class Employee {
    
    private double salary;
    private String name;

    public Employee(String n){
        this.name = n;
        this.salary = 100;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + " " + this.salary;
    }


}
