/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class SoTietKiem {
    private NganHang nganhang ;
    private KhachHang khachhang; 
    private String ngay ;
    private int tienGui, thang;

    public SoTietKiem() {
    }
    

    public NganHang getNganhang() {
        return nganhang;
    }

    public void setNganhang(NganHang nganhang) {
        this.nganhang = nganhang;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getTienGui() {
        return tienGui;
    }

    public void setTienGui(int tienGui) {
        this.tienGui = tienGui;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    
    public Object[] toObject(){
        return new Object[]{
            khachhang.getId(), khachhang.getName() , nganhang.getId(), nganhang.getName(), tienGui,thang, ngay
        };
    }
}
