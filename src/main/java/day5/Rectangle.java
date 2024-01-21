package day5;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Vẽ hình vuông bằng thước kẻ và bút màu " + getColor());
    }
}
