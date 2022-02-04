package ch4;

//******************************************************************** 
// Student.java Author: Lewis/Loftus 
// 
// Represents a college student. 
//********************************************************************

public class Student {

    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double t1,t2,t3;

    // ----------------------------------------------------------------
    // Sets up this Student object with the specified initial values.
    // ----------------------------------------------------------------

    public Student (String first, String last, Address home, Address school) {
    
        firstName = first;
        
        lastName = last;
        
        homeAddress = home;
        
        schoolAddress = school; 

        t1=t2=t3=0;

    }

    public Student (String first, String last, Address home, Address school, double s1, double s2, double s3) {
    
        firstName = first;
        
        lastName = last;
        
        homeAddress = home;
        
        schoolAddress = school; 

        t1=s1;
        t2=s2;
        t3=s3;

    }

    // ----------------------------------------------------------------
    // Returns this Student object as a string.
    //----------------------------------------------------------------
    public String toString() { 
        
        String result;

        result=firstName+" "+lastName+"\n";
        result+="Home Address:\n"+homeAddress+"\n";
        result+="School Address:\n"+schoolAddress+"\n";
        result+="Test 1: "+t1+"\n";
        result+="Test 2: "+t2+"\n";
        result+="Test 3: "+t3+"\n";
        result+="Average: "+this.average()+"\n";

        return result;

    }


    public void setTestScore(int testNum,double score){
        if(testNum==1){
            t1=score;
        }else if(testNum==2){
            t2=score;
        }else{
            t3=score;
        }
    }

    public double getTestScore(int testNum){
        if(testNum==1){
            return t1;
        }else if(testNum==2){
            return t2;
        }
    
        return t3;
    }

    public double average(){
        return (t1+t2+t3)/3;
    }


}