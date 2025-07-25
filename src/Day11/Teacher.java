package Day11;

import java.util.Objects;

public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private int chGrade;
    private int maGrade;
    private int enGrade;


    public Teacher() {
    }

    public Teacher(String name, int age, int chGrade, int maGrade, int enGrade) {
        this.name = name;
        this.age = age;
        this.chGrade = chGrade;
        this.maGrade = maGrade;
        this.enGrade = enGrade;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chGrade
     */
    public int getChGrade() {
        return chGrade;
    }

    /**
     * 设置
     *
     * @param chGrade
     */
    public void setChGrade(int chGrade) {
        this.chGrade = chGrade;
    }

    /**
     * 获取
     *
     * @return maGrade
     */
    public int getMaGrade() {
        return maGrade;
    }

    /**
     * 设置
     *
     * @param maGrade
     */
    public void setMaGrade(int maGrade) {
        this.maGrade = maGrade;
    }

    /**
     * 获取
     *
     * @return enGrade
     */
    public int getEnGrade() {
        return enGrade;
    }

    /**
     * 设置
     *
     * @param enGrade
     */
    public void setEnGrade(int enGrade) {
        this.enGrade = enGrade;
    }

    public String toString() {
        return "Teacher{name = " + name + ", age = " + age + ", chGrade = " + chGrade + ", maGrade = " + maGrade + ", enGrade = " + enGrade + "}";
    }

    @Override
    public int compareTo(Teacher o) {
        int i = (this.chGrade + this.maGrade + this.enGrade) - (o.enGrade + o.chGrade + o.maGrade);
        //如果总分一样，比较语文
        i = i == 0 ? this.getChGrade() - o.getChGrade() : i;
        i = i == 0 ? this.getMaGrade() - o.getMaGrade() : i;
        i = i == 0 ? this.getEnGrade() - o.getEnGrade() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }

    public int showGrade() {
        return chGrade + maGrade + enGrade;
    }
}
