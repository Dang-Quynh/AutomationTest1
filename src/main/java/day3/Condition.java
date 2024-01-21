package day3;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số năm kinh nghiệm của tester: ");
//        int x = scanner.nextInt();
//        System.out.println("Title của tester là: " + printExperience(x));
        bubbleSort2();
    }

    public static void bubbleSort(){
        int arr[] = {3,2,5,6,7,4,8,4,1};
       for (int i=0; i < arr.length - 1; i++){
           for (int j = i + 1; j < arr.length; j++){
               if(arr[i] > arr[j]){
                   int t = arr[i];
                   arr[i] = arr[j];
                   arr[j] = t;
               }
           }
       }

        System.out.println("Dãy số được sắp xếp tăng dần là: ");
        for (int i=0; i< arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }

    public static void bubbleSort2(){
        int arr[] = {3,2,5,6,7,4,8,4,1};
        for (int i=0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("Dãy số được sắp xếp tăng dần là: ");
        for (int i=0; i< arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }

    public static String printExperience(int x){
        if(x <= 0){
            return "none";
        }
        else if(x < 6){
            return "fresher";
        }
        else if(x <= 24){
            return "junior";
        }
        else if(x <= 48){
            return "senior";
        }
        else {
            return "special list";
        }
    }

    public static int printLargeNumber(int x, int y){
        if(x > y){
            return x;
        }
        else {
            return y;
        }
    }

    public static void condition1(){
        boolean str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số x: ");
        int x = scanner.nextInt();
        if(x % 2 == 0){
            str = true;
        }
        else {
            str = false;
        }
        System.out.println(str);

        String str2 = (x%2 == 0) ? "Chia hết cho 2" : "Không chia hết cho 2";
        System.out.println(str2);
    }

    public static void condition2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập số y: ");
        int y = scanner.nextInt();
        int z = (x >= y) ? x : y;

        System.out.println("Số lớn là: " + z);

        String str2 = (x != 0 && x % 2 == 0) ? "Số chẵn" : "Số lẻ";
        System.out.println("x là "+ str2);
    }

    public static void loop3(){
        for(int i = 1; i <= 100; i++){
            if(i%5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
