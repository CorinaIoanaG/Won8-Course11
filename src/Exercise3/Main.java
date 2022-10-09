package Exercise3;

import java.util.*;

public class Main {
    static List<Employee> employees = new ArrayList<>();
    static Map<String, List<Employee>> employeesCompany = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        employees.add(new Employee("Ana", 38, "brown", "A", 5800));
        employees.add(new Employee("Andrei", 33, "dark", "B", 6700));
        employees.add(new Employee("Diana", 28, "blonde", "A", 6000));
        employees.add(new Employee("Raluca", 33, "brown", "A", 5000));
        employees.add(new Employee("Radu", 28, "dark", "B", 6000));
        //3.1
        System.out.print("Enter the minimum salary ");
        System.out.println(salariesGreaterThan(scanner.nextInt()));
        //3.2
        employeesFromCompany();
        System.out.println(employeesCompany);
        // 3.3
        System.out.println(cumulativeSalaryCompany());
    }

    private static List<Employee> salariesGreaterThan(Integer minSalary) {
        List<Employee> result = new ArrayList<>();
        if (employees.size() > 0 && minSalary != null) {
            for (Employee employee : employees) {
                if (employee.salary() > minSalary) {
                    result.add(new Employee(employee.name(), employee.age(), employee.hairColour(), employee.company(), employee.salary()));
                }
            }
        }
        return result;
    }

    private static Map<String, List<Employee>> employeesFromCompany() {
        if (employees.size() > 0) {
            for (Employee employee : employees) {
                if (!employeesCompany.containsKey(employee.company())) {
                    employeesCompany.put(employee.company(), new ArrayList<>());
                }
                employeesCompany.get(employee.company()).add(employee);
            }
        }
        return employeesCompany;
    }

    private static Map<String, Integer> cumulativeSalaryCompany() {
        Map<String, Integer> result = new HashMap<>();
        Integer sum;
        Set<Map.Entry<String, List<Employee>>> entries = employeesCompany.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entries) {
            sum = 0;
            for (Employee element : entry.getValue()) {
                sum+= element.salary();
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }
}
