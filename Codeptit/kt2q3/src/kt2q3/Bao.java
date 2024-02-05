/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q3;

/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu{
    private String ngayPH ;

    public Bao(String ma, String nxb, String soBan, String ngayPH) {
        super(ma, nxb, soBan);
        this.ngayPH = ngayPH ;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    
    @Override
    public String toString(){
        return ma + " " + nxb + " " + soBan + " " + ngayPH ;
    }
}
