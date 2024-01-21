package day5_btvn3;

public class BA extends Employee{
    private int numberOfFeature = 0;
    private double basic_salary = 5200000;

    @Override
    public void initInfo() {
        super.initInfo();
        System.out.print("Nhập số tính năng đã thiết kế: ");
        numberOfFeature = scanner.nextInt();
    }

    @Override
    public double calcSalary() {
        return (basic_salary + getLevel()*500000)*calcPerformance(numberOfFeature);
    }

    private double calcPerformance(int features){
        if(features <= 0){
            return 0;
        }
        else if(features < 3){
            return 0.8;
        }
        else if(features < 4){
            return 1;
        }
        else if(features < 5){
            return 1.2;
        }
        else {
            return 1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n, số lỗi tính năng thiết kế: " + this.numberOfFeature +
                ", lương: " + this.calcSalary();
    }
}
