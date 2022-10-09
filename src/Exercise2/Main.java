package Exercise2;

import java.util.*;

public class Main {
    static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        persons.add(new Person("Ana", 38, "brown"));
        persons.add(new Person("Andrei", 33, "dark"));
        persons.add(new Person("Diana", 28, "blonde"));
        persons.add(new Person("Raluca", 33, "brown"));
        persons.add(new Person("Radu", 28, "dark"));
        persons.add(new Person("Tudor", 25, "brown"));
        persons.add(new Person("Alina", 38, "blonde"));
        //2.1
        System.out.printf(personsName().toString());
        System.out.println();
        //2.2
        Map<String, Integer> personsNameAge = new HashMap<>();
        for (Person person : persons) {
            personsNameAge.put(person.name(), person.age());
        }
        System.out.println(personsNameAge);
        //2.3
        System.out.print("Enter the minimum age ");
        System.out.println(personsOlderThan(scanner.nextInt()));
        //2.4
        System.out.println(personsGroupedByHairColour());
        //2.5
        System.out.println(personsGroupedByAge());

    }

    private static List<String> personsName() {
        List<String> result = new ArrayList<>();
        if (persons.size() > 0) {
            for (Person person : persons) {
                result.add(person.name());
            }
        }
        return result;
    }

    private static List<Person> personsOlderThan(Integer minAge) {
        List<Person> result = new ArrayList<>();
        if (persons.size() > 0 && minAge != null) {
            for (Person person : persons) {
                if (person.age() > minAge) {
                    result.add(new Person(person.name(), person.age(), person.hairColour()));
                }
            }
        }
        return result;
    }

    private static Map<String, List<String>> personsGroupedByHairColour() {
        Map<String, List<String>> result = new HashMap<>();
        if (persons.size() > 0) {
            for (Person person : persons) {
                if (!result.containsKey(person.hairColour())) {
                    result.put(person.hairColour(), new ArrayList<>());
                }
                result.get(person.hairColour()).add(person.name());
            }
        }
        return result;
    }

    private static Map<Integer, List<String>> personsGroupedByAge() {
        Map<Integer, List<String>> result = new HashMap<>();
        if (persons.size() > 0) {
            for (Person person : persons) {
                if (!result.containsKey(person.age())) {
                    result.put(person.age(), new ArrayList<>());
                }
                result.get(person.age()).add(person.name());
            }
        }
        return result;
    }
}
