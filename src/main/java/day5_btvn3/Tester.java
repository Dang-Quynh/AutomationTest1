package day5_btvn3;

public class Tester extends Employee{
    private int numberOfBug;
    private double basic_salary = 5000000;

    @Override
    public void initInfo() {
        super.initInfo();
        System.out.print("Nhập số bug đã phát hiện: ");
        numberOfBug = scanner.nextInt();
    }

    @Override
    public double calcSalary() {
        return (basic_salary + getLevel()*500000)*calcPerformance(numberOfBug);
    }

    private double calcPerformance(int bugs){
        if(bugs <= 0){
            return 0;
        }
        else if(bugs < 20){
            return 0.8;
        }
        else if(bugs < 40){
            return 1;
        }
        else if(bugs < 60){
            return 1.2;
        }
        else {
            return 1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n, số lỗi phát hiện: " + this.numberOfBug +
                ", lương: " + this.calcSalary();
    }
}
