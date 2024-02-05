/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds_gd;

/**
 *
 * @author Admin
 */
public class GDTienTe extends GiaoDich implements IThanhTien{

    private double tyGia ; 
    private String loaiTien ;

    public GDTienTe() {
    }

    public GDTienTe(double tyGia, String loaiTien) {
        this.tyGia = tyGia;
        this.loaiTien = loaiTien;
    }

    
    public GDTienTe(double tyGia, String loaiTien, String ma, String ngayGD, double gia, int soluong) {
        super(ma, ngayGD, gia, soluong);
        this.tyGia = tyGia;
        this.loaiTien = loaiTien;
    }

    public double getTyGia() {
        return tyGia;
    }

    public void setTyGia(double tyGia) {
        this.tyGia = tyGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public static String getsMa() {
        String t = "V" + String.format("%3d", GiaoDich.sMa++) ;
        return t ; 
    }

    public static void setsMa(int sMa) {
        GiaoDich.sMa = sMa;
    }
    
    
    @Override
    public double getThanhTien() {
        double t = getGia() * getSoLuong() ;
        if(getLoaiTien().toUpperCase().equals("VND")){
            return t ;
        }
        else{
            return (t*getTyGia()) ;
        }
    }

    @Override
    public String toString() {
        return "GDTienTe{" + "tyGia=" + tyGia + ", loaiTien=" + loaiTien + '}';
    }
    
    
}
