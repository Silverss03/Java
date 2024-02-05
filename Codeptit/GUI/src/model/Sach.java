/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Sach implements Serializable{
    private int ma, soluong ;
    private String ten, tgia, cn ;
    private static int s_ma = 10000 ;

    public Sach() {
        ma = s_ma++ ;
    }

    public Sach(int ma, int soluong, String ten, String tgia, String cn) {
        this.ma = ma;
        this.soluong = soluong;
        this.ten = ten;
        this.tgia = tgia;
        this.cn = cn;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public static int getS_ma() {
        return s_ma;
    }

    public static void setS_ma(int s_ma) {
        Sach.s_ma = s_ma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten, tgia, cn, soluong 
        } ;
    }
}
