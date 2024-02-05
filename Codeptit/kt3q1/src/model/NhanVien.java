/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int id ;
    private String hoten, diachi, dthoai ;
    private static int id_n = 1000 ;

    public NhanVien(int id, String hoten, String diachi, String dthoai) {
        this.id = id;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dthoai = dthoai;
    }

    
    public NhanVien(String hoten, String diachi, String dthoai) throws TrongException, DienThoaiException {
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongException() ; 
        if(!dthoai.matches("\\d+")) throw new DienThoaiException() ;
        this.id = id_n++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dthoai = dthoai;
    }

    public NhanVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public static int getId_n() {
        return id_n;
    }

    public static void setId_n(int id_n) {
        NhanVien.id_n = id_n;
    }
    
    

     public Object[] toObject(){
        return new Object[]{
            id, hoten, diachi, dthoai 
        };
    }
}
