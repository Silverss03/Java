/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q2;

/**
 *
 * @author Admin
 */
public class PTGT {
    protected String ma, hang, nam, mau ;
    protected double gia ;
    protected static int id_n = 1 ;

    public PTGT( String hang, String nam, Double gia, String mau) {
        this.hang = hang;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }
    
    
    public String getMa() {
        return ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
}
