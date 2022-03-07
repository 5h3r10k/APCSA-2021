package ch6.frq;

public class Appointment {
    
    private TimeInterval time;

    public Appointment(TimeInterval t){
        this.time = t;
    }



    public TimeInterval getTime() {
        return this.time;
    }

    public void setTime(TimeInterval time) {
        this.time = time;
    }



    public boolean conflictsWith(Appointment other){
        return this.getTime().overlapsWith(other.getTime());
    }

    public String toString(){
        return "APPT from " + time.getStartTime() + " to " + time.getEndTime();
    }


}
