package Day14.io;

import java.io.Serial;
import java.io.Serializable;

public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 4025235186855802121L;
    private String name;
    private int age;
    private String address;


    public Teacher() {
    }

    public Teacher(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Teacher{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
