package Day08;

import java.util.Objects;

public class Preson {
    private int age;
    private String name;

    public Preson() {
    }

    public Preson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Preson preson = (Preson) o;
        return age == preson.age && Objects.equals(name, preson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
