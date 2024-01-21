package day5_btvn1;

public abstract class HinhHoc {
    private String tenHinh;

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract double tinhDienTich();
}
