package day5;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn bằng compa và bút màu " + getColor());
    }
}
