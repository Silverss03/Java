/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2qt;

/**
 *
 * @author Admin
 */
public class PTGT {
    protected String ma, hang, ngayLanBanh ;
    protected double giaGoc = 0;
    private static int id_n = 1 ;

    public PTGT() {
    }

    public PTGT(String hang, String ngayLanBanh, double giaGoc) {
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaGoc = giaGoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setMa(){
        this.ma = String.format("%03d", id_n++) ;
    }
    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }
    

    
}
