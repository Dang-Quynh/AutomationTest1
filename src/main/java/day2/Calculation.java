package day2;

import java.util.Scanner;

public class Calculation {
    public static void printCalculator1() {
        System.out.println("Các giá trị của phép tính (1123*6745)/500 = " + (1123*6745)/500);
    }

    public static void printCalculator2() {
        Scanner scanner = new Scanner(System.in);
        int[] array2 = new int[10];
        System.out.println("Nhập 10 giá trị của mảng từ bàn phím: ");
        for (int i = 0; i < array2.length; i++){
            System.out.println("Nhập số thứ " + (i+1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // calc sum
        int sum = 0;
        for (int i = 0; i < array2.length; i++){
            sum += array2[i];
        }
        System.out.println("Tổng mảng array2 là: " + sum);
    }

    public static void main(String[] args) {
        printCalculator1();
        System.out.println("");
        printCalculator2();
    }
}
