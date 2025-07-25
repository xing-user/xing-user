package day05.test1;

public class StudentTest {
    public static void main(String[] args) {
        Student st =  new Student();
        st.setNo(1);
        st.setAge(2);
        st.setName("xiaoming");
        st.setTeacherName("hong");
        st.study();
        Student st1 = new Student();
        st1.setNo(2);
        st1.setAge(3);
        st1.setName("ming");
        st1.study();
    }
}
