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
public class BanDoc implements Serializable{
    private int ma ;
    private String hoten, diachi, sdt;
    private static int s_ma = 10000 ;

    public BanDoc() {
    }

    public BanDoc(int ma, String hoten, String diachi, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getS_ma() {
        return s_ma;
    }

    public static void setS_ma(int s_ma) {
        BanDoc.s_ma = s_ma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, hoten, diachi, sdt         
        };
    }
}
