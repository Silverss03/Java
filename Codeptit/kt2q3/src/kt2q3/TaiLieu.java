/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q3;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    protected String ma, nxb, soBan ;

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getSoBan() {
        return soBan;
    }

    public void setSoBan(String soban) {
        this.soBan = soban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public TaiLieu(String ma, String nxb, String soBan) {
        this.ma = ma;
        this.nxb = nxb;
        this.soBan = soBan;
    }
    
}
