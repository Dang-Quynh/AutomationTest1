package day7_btvn;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhân viên:");
        int numberOfEmployee = scanner.nextInt();
        Employee[] employees = new Employee[numberOfEmployee];
        for(int i=0; i < numberOfEmployee; i++){
            employees[i] = new Employee();
            employees[i].initInfo(i+1);
        }

        System.out.println("Tên của tất cả nhân viên là:");
        for(int i=0; i< numberOfEmployee; i++){
            System.out.println(employees[i].getEmployee_name());
        }
    }
}
