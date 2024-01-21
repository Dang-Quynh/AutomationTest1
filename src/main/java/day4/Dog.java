package day4;

public class Dog {
    private String breed;
    private String size;
    private int age;
    private String color;
    public String getInfo(){
        return ("Bread is: "+ breed + "; Size is: " + size + "; Age is: " + age + "; Color is: " + color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breed = "Becgie";
        dog.size = "big";
        dog.age = 2;
        dog.color = "Brown";
        System.out.println(dog.getInfo());
    }
}
