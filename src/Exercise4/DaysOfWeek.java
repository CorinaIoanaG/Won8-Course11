package Exercise4;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public static DaysOfWeek getDayOfWeek(Integer day) {
        return switch (day) {
            case 1 -> DaysOfWeek.MONDAY;
            case 2 -> DaysOfWeek.TUESDAY;
            case 3 -> DaysOfWeek.WEDNESDAY;
            case 4 -> DaysOfWeek.THURSDAY;
            case 5 -> DaysOfWeek.FRIDAY;
            case 6 -> DaysOfWeek.SATURDAY;
            case 7 -> DaysOfWeek.SUNDAY;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }

}
