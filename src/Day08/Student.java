package Day08;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

public class Student extends Preson implements Cloneable{
    private int id;
    int[] data;


    public Student() {
    }

    public Student(int age, String name, int[] data, int id) {
        super(age, name);
        this.data = data;
        this.id = id;
    }

    public Student(int id) {
        this.id = id;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getName() + getAge() + dataString() + getId();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String dataString() {
        StringJoiner dataString = new StringJoiner(", ");
        for (int i = 0; i < data.length; i++) {
            dataString.add(data[i]+"");
        }
        return dataString.toString();
    }
}
