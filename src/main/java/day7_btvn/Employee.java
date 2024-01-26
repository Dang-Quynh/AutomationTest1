package day7_btvn;

import java.util.Scanner;

public class Employee {
    private String employee_name;
    Scanner scanner = new Scanner(System.in);

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void initInfo(int index){
        System.out.println("Nhập tên nhân viên thứ " + (index) + ": ");
        employee_name = scanner.nextLine();
    }
}