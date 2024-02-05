/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra_2;

/**
 *
 * @author Admin
 */
public class SachHoc {
    protected String ma, ten, nhaXB ;
    protected double gia ;
    private static int id_n = 1 ;

    public SachHoc() {
    }

    public SachHoc(String ten, String nhaXB, double gia) {
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMa() {
        this.ma = String.format("%02d", id_n++) ; 
    }
    
    

}
