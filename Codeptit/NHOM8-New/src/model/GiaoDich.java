/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class GiaoDich {
    //(Mã giao dịch, ngày giao dịch 
     //(ngày, tháng, năm), đơn giá, số lượng, 
    private String ma,ngayGD;
    private double gia;
    private int soluong;
    public static int sMa=1;

    public GiaoDich() {
    }
    
    public GiaoDich(String ma,String ngayGD, double gia, int soluong) {
        this.ma = ma;
        this.ngayGD = ngayGD;
        this.gia = gia;
        this.soluong = soluong;
    }
    public GiaoDich(String ngayGD, double gia, int soluong) {
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
    public void setMa() {
        this.ma = String.format("%03d", sMa++);
    }
    public String getNgayGD() {
        return ngayGD;
    }
    public int getNam(){
        String s=getNgayGD();
        return Integer.parseInt(s.substring(s.lastIndexOf("/")+1));
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
    //sap xep theo ma giam dan
//    @Override
//    public int compareTo(GiaoDich t) {
//        return this.ma.compareToIgnoreCase(t.ma);//tang dan
//        //return t.ma.compareToIgnoreCase(this.ma);//giam dan
//    }
    
}
