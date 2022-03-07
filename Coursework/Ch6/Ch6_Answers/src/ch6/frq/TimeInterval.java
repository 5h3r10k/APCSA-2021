package ch6.frq;

public class TimeInterval {
    
    private int startTime, endTime;
    // time interval in 24h time; 600 for 6 am, 1300 for 1 pm.

    public TimeInterval(int start, int end){
        this.startTime = start;
        this.endTime = end;
    }



    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }



    public boolean overlapsWith(TimeInterval time){
        return (this.getStartTime() < time.getEndTime() && this.getStartTime() > time.getStartTime())
        || (this.getEndTime() < time.getEndTime() && this.getEndTime() > time.getStartTime())
        || (time.getStartTime() < this.getEndTime() && time.getStartTime() > this.getStartTime())
        || (time.getEndTime() < this.getEndTime() && time.getEndTime() > this.getStartTime());
    }

}
