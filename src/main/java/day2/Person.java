package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        System.out.println((1123*6745)/500);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        printLargeNumber(a,b);

        System.out.println("");
        int array[] = {1,2,3,6,4};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

    public static void printLargeNumber(int a, int b){
        if(a > b){
            System.out.print(a);
        }
        else {
            System.out.print(b);
        }
    }

    public static void printArray(int a[]){

    }
}
