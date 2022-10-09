package Exercise3;

import Exercise2.Person;
import java.util.List;

public class Employee extends Person {
    private String company;
    private Integer salary;

    public Employee(String name, Integer age, String hairColour, String company, Integer salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String company() {
        return company;
    }

    public Integer salary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + this.name() + ", " +
                "age=" + this.age()+ ", " +
                "hairColour=" + this.hairColour() + ", " +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

}