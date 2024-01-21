package btvn_day4;

public class Developer {
    public static void main(String[] args) {
        Employee developer1 = new Employee();
        developer1.setEmployee_id(1);
        developer1.setEmployee_name("Nguyễn Văn A");
        System.out.println("Mã nhân viên: " + developer1.getEmployee_id() + "; Tên nhân viên: " + developer1.getEmployee_name() + "; Mức lương: " + developer1.getEmployee_salary());

        Employee developer2 = new Employee();
        developer1.setEmployee_id(2);
        developer1.setEmployee_name("Nguyễn Văn B");
        System.out.println("Mã nhân viên: " + developer2.getEmployee_id() + "; Tên nhân viên: " + developer2.getEmployee_name() + "; Mức lương: " + developer2.getEmployee_salary());

        Employee developer3 = new Employee();
        developer1.setEmployee_id(3);
        developer1.setEmployee_name("Nguyễn Văn C");
        System.out.println("Mã nhân viên: " + developer3.getEmployee_id() + "; Tên nhân viên: " + developer3.getEmployee_name() + "; Mức lương: " + developer3.getEmployee_salary());

        // private double employee_salary = 100000;
        // tạo giá trị mặc định cho biến khi khai báo, trong trường hợp biến không có giá trị thì nó sẽ nhận giá trị mặc định
        // Vì vậy trong trường hợp không cho phép thay đổi 'employee_salary' thì tất cả các developer sẽ nhận giá trị employee_salary mặc định là 100000,
    }
}
