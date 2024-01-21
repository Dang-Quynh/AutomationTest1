package day5_btvn3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        double averageSalary = 0;
        double sumSalary = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int numberOfEmployee = scanner.nextInt();
        Employee[] employees = new Employee[numberOfEmployee];

        System.out.println("Nhập thông tin cho nhân viên");
        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Chọn loại nhân viên (1 - Developer, 2 - BA, 3 - Tester, mặc định - Deverloper): ");
            int choose = scanner.nextInt();

            if (choose == 2) {
                employees[i] = new BA();
            }
            else if (choose == 3) {
                employees[i] = new Tester();
            }
            else {
                employees[i] = new Developer();
            }
            employees[i].initInfo();
            sumSalary += employees[i].calcSalary();
        }

        averageSalary = sumSalary / numberOfEmployee;

        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println(employees[i].toString());
        }

        System.out.println("Mức lương trung bình là: " + averageSalary);
        System.out.println("Thông tin của các nhân viên có mức lương cao hơn mức lương trung bình là: ");
        for (int i = 0; i < numberOfEmployee; i++) {
            if(employees[i].calcSalary() > averageSalary){
                System.out.println(employees[i].toString());
            }
        }

        System.out.println("Tổng chi phí trả lương cho nhân viên là: " + sumSalary*1.1);
    }
}
