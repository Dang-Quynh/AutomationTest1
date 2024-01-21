package day5_btvn3;

public class Developer extends Employee{
    private double overtimeHours = 0;
    private double performance = 1;
    private double basic_salary = 5400000;

    @Override
    public void initInfo() {
        super.initInfo();
        System.out.print("Nhập số giờ làm việc ngoài giờ: ");
        overtimeHours = scanner.nextInt();
        System.out.print("Nhập số hệ số hiệu suất công việc: ");
        performance = scanner.nextDouble();
    }

    @Override
    public double calcSalary() {
        // lương = (lương cơ bản + bậc lương theo level) nhân với hiệu suất làm việc
        // lương ngoài giờ = ((lương cơ bản + bậc lương theo level) chia cho tổng giờ làm việc 1 tháng) nhân với số gời overtime nhân với hệ số 1.5
        // tổng lương = lương + lương ngoài giờ
        return (basic_salary + getLevel()*500000)*(performance + overtimeHours*1.5/(26*8));
    }

    @Override
    public String toString() {
        return super.toString() + "\n, số giờ làm việc ngoài giờ: " + this.overtimeHours + ", hiệu suất công việc: " + this.performance +
                ", lương: " + this.calcSalary();
    }
}
