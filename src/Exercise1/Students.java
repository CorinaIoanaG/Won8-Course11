package Exercise1;

import java.util.HashMap;
import java.util.Map;

public class Students {

    public static void main(String[] args) {
        Map<String, Integer> studentsGrades = new HashMap<>();
        studentsGrades.put("Corina G", 10);
        studentsGrades.put("Raul A", 9);
        studentsGrades.put("Andrei B", 8);
        studentsGrades.put("Bogdana C", 9);
        studentsGrades.put("Mirela F", null);
        studentsGrades.put("Ioana A", 10);
        System.out.println(studentsGrades.entrySet());
        System.out.println(highestGrade(studentsGrades));
    }

    public static Map<String, Integer> highestGrade(Map<String, Integer> studentsGrades) {
        Map<String, Integer> result = new HashMap<>();
        if (studentsGrades.size() == 0) {
            return result;
        }
        Integer max = 0;
        for (Map.Entry<String, Integer> element : studentsGrades.entrySet()) {
            if (element.getValue() != null && element.getValue() > max) {
                max = element.getValue();
            }
        }
        for (Map.Entry<String, Integer> element : studentsGrades.entrySet()) {
            if (element.getValue() == max)
                result.put(element.getKey(), element.getValue());
        }
        return result;
    }

}

