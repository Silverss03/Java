/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra_2;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class SachThamKhao extends SachHoc implements ISach{
    private Boolean loai ;

    public SachThamKhao(String ten, String nhaXB,Boolean loai,  double gia) {
        super(ten, nhaXB, gia);
        this.loai = loai;
    }

    public Boolean isLoai() {
        return loai;
    }

    @Override
    public void setMa() {
        String[] s = super.getNhaXB().split("\\s+") ;
        String id = "" ;
        for(int i = 0 ; i < s.length ; i++){
            id += s[i].substring(0,1).toUpperCase() ;
        }
        super.setMa() ;
        this.ma = id+ this.ma;
    }
    
    @Override
    public String toString(){
        if(loai){
            return this.ma + " " + this.ten + " " + this.nhaXB + " co ban" + " " + new DecimalFormat("#.#").format(this.getGia()) ;
        }
        else{
            return this.ma + " " + this.ten + " " + this.nhaXB + " nang cao " + new DecimalFormat("#.#").format(this.getGia()) ;
        }
    }
    
    @Override
    public double getGia(){
        if(loai){
            this.gia = this.gia * (1.1) ;
        }
        else {
            this.gia = (this.gia * 1.15) ;
        }
        return Math.round(this.gia) ;
    }
}
