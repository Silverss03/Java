/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class GiaoDichTT extends GiaoDich implements IGiaoDich{
     //tỉ giá, loại tiền tệ
    private double tigia;
    private String loaiTien;

    public GiaoDichTT() {
    }

    public GiaoDichTT(String ngay, double gia, int soluong,double tigia, String loaiTien) {
        super(ngay, gia, soluong);
        this.tigia = tigia;
        this.loaiTien = loaiTien;
    }

    public double getTigia() {
        return tigia;
    }
    @Override
    public void setMa(){
        super.setMa();
        super.setMa("TT-"+super.getMa());
    }
    @Override
    public String getMa(){
        return super.getMa();
    }
    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }
    
    @Override
    public double getThanhTien() {
        if(getLoaiTien().equalsIgnoreCase("VN")){
            return (super.getGia()*super.getSoluong());
        }else{
            return (super.getGia()*super.getSoluong()*getTigia());
        }
    }
    @Override
    public String toString(){
        return getMa()+"\t"+getNgay()+"\t"+
                getGia()+"\t"+getSoluong()+"\t"+getLoaiTien()+"\t"+
                getTigia()+"\t"+getThanhTien();
    }
    
}
