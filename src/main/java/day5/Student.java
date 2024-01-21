package day5;

public class Student extends Person {
    private String studentId;

    @Override
    public void play() {
        System.out.println("Sinh viên " + getName() + " đi chơi vào thứ 6");
    }
    public void test(){
        System.out.println("Sinh viên " + studentId + " phải thi ký 1 và kỳ 2 hằng năm");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
