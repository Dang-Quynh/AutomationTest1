package day5;

public class Teacher extends Person{
    private String teacherId;

    @Override
    public void play() {
        System.out.println("Giáo viên " + getName() + " đi chơi vào thứ 7");
    }

    public void teach() {
        System.out.println("Giáo viên " + teacherId + " đi dạy vào thứ 5 hằng tuần");
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

}
