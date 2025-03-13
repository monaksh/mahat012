enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class day26b {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " is weekend? " + day.isWeekend());
        }
    }
}
