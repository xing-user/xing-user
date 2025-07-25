package Day15.webcrawl;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double power;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Student(String name, String gender, int age, double power, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.power = power;
        this.weight = weight;
    }

    public Student() {
    }

    public Student(String name, String gender, int age, double power) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.power = power;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     * @return power
     */
    public double getPower() {
        return power;
    }

    /**
     * 设置
     * @param power
     */
    public void setPower(double power) {
        this.power = power;
    }

    public String toString() {
        return "Student{name = " + name + ", gender = " + gender + ", age = " + age + ", power = " + power + "}";
    }
}
