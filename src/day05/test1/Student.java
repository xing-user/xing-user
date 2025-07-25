package day05.test1;

public class Student {
    private String name;
    private int age;
    //学号
    private int no;
    private  static  String teacherName;

    public Student() {
    }

    public Student(String name, int age, int no) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public void study(){
        System.out.println(name+" "+age+" "+no+" "+teacherName);
    }
}
