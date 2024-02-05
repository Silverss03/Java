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
public class SachGiaoKhoa extends SachHoc implements ISach {
    private int lop, tap ;
    private boolean baitap ; 

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String ten, String nhaXB,int lop, int tap, boolean baitap,  double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
        this.baitap = baitap;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getTap() {
        return tap;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public boolean isBaitap() {
        return baitap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }
    
    @Override
    public void setMa(){
        super.setMa() ;
        this.ma = "SGK" + Integer.toString(this.lop) + Integer.toString(this.tap) + this.ma ;
    }
    
    @Override
    public String toString(){
        if(baitap){
            return this.ma + " " + this.ten + " " + this.nhaXB + " " + Integer.toString(this.lop) + " " + Integer.toString(this.tap)+ " bai tap" + " " + new DecimalFormat("#.#").format(this.getGia()) ;
        }
        else{
            return this.ma + " " + this.ten + " " + this.nhaXB + " " + Integer.toString(this.lop) + " " + Integer.toString(this.tap) + " ly thuyet " + new DecimalFormat("#.#").format(this.getGia()) ;
        }
    }
    
    @Override
    public double getGia(){
        if(lop >= 1 && lop <= 5){
            this.gia = this.gia * 0.9 ;
        }
        else if(lop >= 6 && lop <= 9){
            this.gia = this.gia * 0.95 ;
        }
        if(baitap){
            this.gia = this.gia * 1.05 ;
        }
        return Math.round(this.gia) ;
    }
}
