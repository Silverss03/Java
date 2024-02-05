package ds_gd;

import java.util.* ;
public class GiaoDich {
    private String ma, ngayGD ;
    private double gia ;
    private int soluong ;
    public static int sMa = 0 ; 
    public GiaoDich() {
    }

    public GiaoDich(String ma, String ngayGD, double gia, int soluong) {
        this.ma = ma;
        this.ngayGD = ngayGD;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    
}
