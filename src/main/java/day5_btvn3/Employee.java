package day5_btvn3;

import java.util.Scanner;

public abstract class Employee {
    private String employee_id;
    private String employee_name;
    private String employee_birthday;
    private String employee_phone;
    private int level = 1;
    Scanner scanner = new Scanner(System.in);


    public void initInfo() {
        System.out.print("Nhập mã nhân viên: ");
        employee_id = scanner.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        employee_name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        employee_birthday = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        employee_phone = scanner.nextLine();
        System.out.print("Nhập level: ");
        level = scanner.nextInt();
    }

    public abstract double calcSalary();

    @Override
    public String toString() {
        return "Mã nhân viên: " + this.employee_id + ", họ tên nhân viên: " + this.employee_name + ", ngày sinh: " + this.employee_birthday +
        ", số điện thoại: " + this.employee_phone +", level: " + this.level;
}

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}