package day5_overloading;

public class Sum1 {
    public static int add(int x, int y){
        return x + y;
    }

    public static double add(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int x= 20;
        int y = 23;
        double z = 20.45;
        System.out.println(add(x,y));
        System.out.println(add(z,x));
    }
}
