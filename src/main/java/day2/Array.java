package day2;

public class Array {
    public static void printArray() {
        int[] array1 = {1,2,3,6,4};
        System.out.println("Các giá trị của mảng array1 là: ");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + ", ");
        }
    }

    public static void printArray2() {
        int[] array2 = new int[10];
        System.out.println("Gán các giá trị của mảng array2 là các số nguyên từ 1 đến 10: ");
        for (int i = 0; i < array2.length; i++){
            array2[i] = i + 1;
        }
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + ", ");
        }
    }

    public static void main(String[] args) {
       printArray();
       System.out.println("");
       printArray2();
    }












    public static void printLargeNumber(int array[]){
//        Arrays.sort(array);
//        System.out.println("Số lớn nhất: " + array[array.length-1]);
//        printLargeNumber(array);
        int largeNumber = array[0];
        for (int i = 1; i< array.length; i++){
            if(largeNumber < array[i]){
                largeNumber = array[i];
            }
        }
        System.out.println("Số lớn nhất: " + largeNumber);
    }
}
