/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q3;

/**
 *
 * @author Admin
 */
public class TapChi extends TaiLieu{
    private int soPH, thangPH ;

    public TapChi(String ma, String nxb, String soBan, int soPH, int thangPH) {
        super(ma, nxb, soBan);
        this.soPH = soPH ; 
        this.thangPH = thangPH ;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    
    public String toString(){
        return ma + " " + nxb + " " + soBan + " " + soPH + " " + thangPH ;
    }
}
