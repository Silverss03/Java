/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class GDVang extends GiaoDich implements IThanhTien{
    private String loaiVang;

    public GDVang() {
    }

    public GDVang( String ma, 
            String ngayGD,String loaiVang, double gia, int soluong) {
        super(ma, ngayGD, gia, soluong);
        this.loaiVang = loaiVang;
    }
    public GDVang( 
            String ngayGD, double gia, int soluong,String loaiVang) {
        super(ngayGD, gia, soluong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    public void setMa(){
        super.setMa();
        super.setMa("V-"+getMa());
    }
    
    public String getMa(){
        return super.getMa();
    }
    @Override
    public double getThanhTien() {
        return super.getSoluong()*super.getGia();
    }
    public String toString(){
        String t=super.getMa()+"\t"+super.getNgayGD()+"\t"+getGia()+" "+
                getSoluong()+" "+
                getLoaiVang()+"\t"+getThanhTien();
        return t;
    }
}
