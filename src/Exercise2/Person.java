package Exercise2;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private String hairColour;

    public Person(String name, Integer age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String name() {
        return name;
    }

    public Integer age() {
        return age;
    }

    public String hairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.age, that.age) &&
                Objects.equals(this.hairColour, that.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "hairColour=" + hairColour + ']';
    }

}
