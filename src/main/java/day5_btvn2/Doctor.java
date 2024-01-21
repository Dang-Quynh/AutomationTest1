package day5_btvn2;

public class Doctor {
    public enum Loai {
        chuyenkhoa,
        dakhoa
    }
    private String ten;
    private double luongCoBan = 19000000;
    private double heSoLuong;
    private double soNamKinhNghiem;
    private Loai loai;

    public Doctor(String ten, double heSoLuong, double soNamKinhNghiem, Loai loai) {
        this.ten = ten;
        this.heSoLuong = heSoLuong;
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.loai = loai;
    }

    public Doctor(String ten, double heSoLuong, double soNamKinhNghiem) {
        this.ten = ten;
        this.heSoLuong = heSoLuong;
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public Doctor(String ten, double heSoLuong) {
        this.ten = ten;
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong(double luongCoBan, double heSoLuong){
        return luongCoBan * heSoLuong;
    }
    public double tinhLuong(double luongCoBan, double heSoLuong, double soNamKinhNghiem){
        return luongCoBan * heSoLuong * soNamKinhNghiem;
    }
    public double tinhLuong(double luongCoBan, double heSoLuong, double soNamKinhNghiem, Loai loai){
        return luongCoBan * heSoLuong * soNamKinhNghiem * tinhHeSoLoai(loai);
    }

    public double tinhHeSoLoai(Loai loai){
        if(loai == Loai.chuyenkhoa){
            return 0.2;
        }
        else if(loai == Loai.dakhoa){
            return 0.45;
        }
        return 1;
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Nguyen Van A", 0.8);
        System.out.println("Luong cua bac si " + doctor1.ten + " la : " + doctor1.tinhLuong(doctor1.luongCoBan, doctor1.heSoLuong));

        Doctor doctor2 = new Doctor("Nguyen Van B", 1.1, 2);
        System.out.println("Luong cua bac si " + doctor2.ten + " la : " + doctor2.tinhLuong(doctor2.luongCoBan, doctor2.heSoLuong, doctor2.soNamKinhNghiem));

        Doctor doctor3 = new Doctor("Nguyen Van C", 2, 2, Loai.dakhoa);
        System.out.println("Luong cua bac si " + doctor3.ten + " la : " + doctor3.tinhLuong(doctor3.luongCoBan, doctor3.heSoLuong, doctor3.soNamKinhNghiem, doctor3.loai));
    }
}
