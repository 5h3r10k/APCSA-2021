package ch6.frq;

public class DailyScheduleTesting {
    public static void main(String[] args) {
        DailySchedule schedule = new DailySchedule();
        System.out.println(schedule.getSchedule());
        schedule.addAppt(new Appointment(new TimeInterval(100, 300)), false);
        System.out.println(schedule.getSchedule());
        schedule.addAppt(new Appointment(new TimeInterval(200, 400)), false);
        System.out.println(schedule.getSchedule());
        schedule.addAppt(new Appointment(new TimeInterval(600, 1200)), false);
        System.out.println(schedule.getSchedule());
        schedule.addAppt(new Appointment(new TimeInterval(800, 1400)), true);
        System.out.println(schedule.getSchedule());
    }
}
