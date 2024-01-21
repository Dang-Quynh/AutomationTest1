package day5;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguễn van A");
        student.setStudentId("S123");
        student.play();
        student.test();

        Teacher teacher = new Teacher();
        teacher.setTeacherId("T123");
        teacher.setName("Nguyễn van B");
        teacher.play();
        teacher.teach();
    }
}
