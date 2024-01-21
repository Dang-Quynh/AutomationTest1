package day5_btvn1;

public class Application {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.setTenHinh("Hình tròn");
        hinhTron.banKinh = 5;
        System.out.println("Diện tích " + hinhTron.getTenHinh() + " là: " + hinhTron.tinhDienTich());

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setTenHinh("Hình vuong");
        hinhVuong.chieuDaiMotCanh = 15;
        System.out.println("Diện tích " + hinhVuong.getTenHinh() + " là: " + hinhVuong.tinhDienTich());
    }
}
