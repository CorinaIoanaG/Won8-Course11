package Exercise4;

import java.util.*;

public class Main {
    static Map<DaysOfWeek, List<String>> daySchedule = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer day;
        String activity;
        daySchedule.put(DaysOfWeek.MONDAY, new ArrayList<>());
        daySchedule.get(DaysOfWeek.MONDAY).add("Production Meeting");
        daySchedule.get(DaysOfWeek.MONDAY).add("Product Presentation");
        do {
            System.out.println("Enter the number of day of the week (1-7) where you want to add activity");
            day = scanner.nextInt();
        }
        while (day > 7 || day < 1);
        scanner.nextLine();
        System.out.println("Enter the activity you want to add");
        activity = scanner.nextLine();
        addActivity(day, activity);
        System.out.println(daySchedule);
        do {
            System.out.println("Enter the number of day of the week (1-7) where you want to remove activity");
            day = scanner.nextInt();
        }
        while (day > 7 || day < 1);
        scanner.nextLine();
        System.out.println("Enter the activity you want to remove");
        activity = scanner.nextLine();
        removeActivity(day, activity);
        System.out.println(daySchedule);
        do {
            System.out.println("Enter the number of day of the week (1-7) you want to clear");
            day = scanner.nextInt();
        }
        while (day > 7 || day < 1);
        clearADay(day);
        System.out.println(daySchedule);
    }

    private static void addActivity(Integer day, String activity) {
        DaysOfWeek dayOfWeek;
        dayOfWeek = DaysOfWeek.getDayOfWeek(day);
        if (!daySchedule.containsKey(dayOfWeek)) {
            daySchedule.put(dayOfWeek, new ArrayList<>());
        }
        daySchedule.get(dayOfWeek).add(activity);
    }

    private static void removeActivity(Integer day, String activity) {
        DaysOfWeek dayOfWeek;
        dayOfWeek = DaysOfWeek.getDayOfWeek(day);
        if (daySchedule.containsKey(dayOfWeek)) {
            daySchedule.get(dayOfWeek).remove(activity);
            if (daySchedule.get(dayOfWeek).size() == 0) {
                daySchedule.remove(dayOfWeek);
            }
        }
    }

    private static void clearADay(Integer day) {
        DaysOfWeek dayOfWeek;
        dayOfWeek = DaysOfWeek.getDayOfWeek(day);
        if (daySchedule.containsKey(dayOfWeek)) {
            daySchedule.remove(dayOfWeek);
        }
    }
}
