/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class GDTienTe extends GiaoDich implements IThanhTien{
    
    private double tyGia;
    private String loaiTien;

    public GDTienTe() {
    }

    public GDTienTe(
            String ma, String ngayGD,double tyGia, String loaiTien,
            double gia, int soluong) {
        super(ma, ngayGD, gia, soluong);
        this.tyGia = tyGia;
        this.loaiTien = loaiTien;
    }
    public GDTienTe(
            String ngayGD,
            double gia, int soluong,double tyGia, String loaiTien) {
        super( ngayGD, gia, soluong);
        this.tyGia = tyGia;
        this.loaiTien = loaiTien.toUpperCase();
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
    public void setMa(){
        super.setMa();
        super.setMa("TT-"+getMa());
    }
    public String getMa(){
        return super.getMa();
    }
    @Override
    public double getThanhTien() {
        if(getLoaiTien().toUpperCase().equals("VND")){
            return (getGia()*getSoluong());
        }else{
            return (getGia()*getSoluong()*getTyGia());
        }
    }
    public String toString(){
        String t=super.getMa()+"\t"+super.getNgayGD()+"\t"+getGia()+"\t"+
                getSoluong()+"\t"+
                getLoaiTien().toUpperCase()+"\t"+getTyGia()+"\t"+getThanhTien();
        return t;
    }
    
}
