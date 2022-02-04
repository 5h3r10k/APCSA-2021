package ch4;

public class Course {
    
    private String name;
    private Student s1,s2,s3,s4,s5;
    private int studentCt;

    public Course(String s){
        name = s;
        studentCt = 0;
    }

    public void addStudent(Student stud){
        if(studentCt==0){
            s1 = stud;
        }else if(studentCt==1){
            s2 = stud;
        }else if(studentCt==2){
            s3 = stud;
        }else if(studentCt==3){
            s4 = stud;
        }else if(studentCt==4){
            s5 = stud;
        }
        
        if(studentCt==5){
            System.out.println("Student capacity (5) reached.");
        }else{
            studentCt++;
        }
        
    }

    public double average(){

        double total = 0;

        if(studentCt>=1) total+=s1.average();
        if(studentCt>=2) total+=s2.average();
        if(studentCt>=3) total+=s3.average();
        if(studentCt>=4) total+=s4.average();
        if(studentCt==5) total+=s5.average();

        return total/studentCt;

    }

    public void roll(){
        System.out.println("-------- "+name+" --------");
        if(studentCt>=1) System.out.println(s1);
        if(studentCt>=2) System.out.println(s2);
        if(studentCt>=3) System.out.println(s3);
        if(studentCt>=4) System.out.println(s4);
        if(studentCt==5) System.out.println(s5);
    }

}
