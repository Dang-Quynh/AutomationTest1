package day5;

public abstract class Shape {
    private String color = "red";

    public abstract void draw();

    public String getColor() {
        return color;
    }
}
