package day4;

public class Student {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId("P123");
        person1.setName("Hieu");
        person1.setAge(24);
        person1.setPhone("023543546");
        System.out.println("Họ tên: " + person1.getName() + "Id: " +
                person1.getId() + "; Tuổi: " + person1.getAge() + "; Số điện thoại: " + person1.getPhone());
    }
}
