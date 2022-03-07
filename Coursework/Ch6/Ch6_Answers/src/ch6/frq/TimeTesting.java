package ch6.frq;

public class TimeTesting {
    
    public static void main(String[] args) {
        
        TimeInterval t1 = new TimeInterval(600,800);
        TimeInterval t2 = new TimeInterval(400,601);

        System.out.println(t1.overlapsWith(t2));

    }

}
