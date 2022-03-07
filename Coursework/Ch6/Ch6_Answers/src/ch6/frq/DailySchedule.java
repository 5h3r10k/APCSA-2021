package ch6.frq;

import java.util.ArrayList;

public class DailySchedule {
    
    private ArrayList<Appointment> apptList;


    public DailySchedule(){
        apptList = new ArrayList<Appointment>();
    }

    public void clearConflicts(Appointment appt){
        for(int i = apptList.size()-1;i>=0;i--){
            if(apptList.get(i).conflictsWith(appt)) apptList.remove(i);
        }
    }

    public boolean addAppt (Appointment appt, boolean emergency){
        if(emergency){
            clearConflicts(appt);
        }else{
            for(int i = apptList.size()-1;i>=0;i--){
                if(apptList.get(i).conflictsWith(appt)) return false;
            }
        }

        apptList.add(appt);
        return true;
    }

    public ArrayList<Appointment> getSchedule(){
        return apptList;
    }

}
