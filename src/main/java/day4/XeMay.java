package day4;

public class XeMay {
    public static void main(String[] args) {
        Xe xeMay = new Xe();
        xeMay.setTenXe("Xe máy");
        xeMay.setLoaiXe("SH");
        xeMay.setVanTocMax(120);
        System.out.println("Tên xe: " + xeMay.getTenXe() + "; Loại xe: " + xeMay.getLoaiXe() + "; Vận tốc max: " + xeMay.getVanTocMax());
    }
}
