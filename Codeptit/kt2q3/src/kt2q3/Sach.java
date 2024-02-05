/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q3;

public class Sach extends TaiLieu{
    private String tacGia, tenSach ;
    private int soTrang ;

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach(String ma, String nxb, String soBan,String tacGia, String tenSach, int soTrang) {
        super(ma, nxb, soBan) ;
        this.tacGia = tacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    @Override
    public String toString(){
        return ma + " " + nxb + " " + soBan + " " + tacGia + " " + tenSach + " " + soTrang ;
    }
    
}
