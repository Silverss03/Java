/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q2;

/**
 *
 * @author Admin
 */
public class XeTai extends PTGT{
    private String trongtai ; 

    public XeTai(String hang, String nam, Double gia, String mau, String trongtai) {
        super(hang, nam, gia, mau);
        this.trongtai = trongtai ;
    }

    public String getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(String trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public String getMa() {
        return ma;
    }

    public void setMa() {
        this.ma = String.format("XT-%03d", id_n++);
    }
    
    @Override
    public String toString(){
        return super.getMa() + " " + super.getHang() + " " + super.getNam() + " " + super.getMau() + " " + super.getGia() + " " + trongtai ;
    }
}
