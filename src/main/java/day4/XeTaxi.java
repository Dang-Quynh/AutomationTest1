package day4;

public class XeTaxi {
    public static void main(String[] args) {
        Xe xeTaxi = new Xe();
        xeTaxi.setTenXe("Xe Taxi");
        xeTaxi.setLoaiXe("Taxi");
        xeTaxi.setVanTocMax(240);
        System.out.println("Tên xe: " + xeTaxi.getTenXe() + "; Loại xe: " + xeTaxi.getLoaiXe() + "; Vận tốc max: " + xeTaxi.getVanTocMax());


    }
}
