/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class DichVu implements Serializable{
    private int id ;
    private String ten, nhom ;
    private Double chiphi, cuoc ;
    private static int id_n = 1000 ;

    public DichVu(String ten, String nhom, Double chiphi, Double cuoc) throws TrongException {
        if(ten.isEmpty() ) throw new TrongException() ; 
        
        this.id = id_n++;
        this.ten = ten;
        this.nhom = nhom;
        this.chiphi = chiphi;
        this.cuoc = cuoc;
    }

    public DichVu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public Double getChiphi() {
        return chiphi;
    }

    public void setChiphi(Double chiphi) {
        this.chiphi = chiphi;
    }

    public Double getCuoc() {
        return cuoc;
    }

    public void setCuoc(Double cuoc) {
        this.cuoc = cuoc;
    }

    public static int getId_n() {
        return id_n;
    }

    public static void setId_n(int id_n) {
        DichVu.id_n = id_n;
    }
    
    public Object[] toObject(){
        return new Object[]{
            id, ten, nhom, chiphi, cuoc 
        };
    }
}
