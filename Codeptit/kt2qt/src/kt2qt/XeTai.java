/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2qt;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class XeTai extends PTGT implements IPTGT{
    private double trongTai ; 
    private Boolean thung ; 
    public XeTai() {
    }

    public XeTai( String hang,String ngayLanBanh,double giaGoc, double trongTai, Boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public Boolean isThung() {
        return thung;
    }

    public void setThung(Boolean thung) {
        this.thung = thung;
    }

    @Override
    public void setMa() {
        super.setMa();
        this.ma = "T-" + super.getMa() ;
    }
        
    @Override
    public double getGiaBan() {
        Year tmp = Year.now() ;
        Long now = Long.valueOf(tmp.toString()) ;
        String[] arr = this.ngayLanBanh.split("/") ;
        Long nam = Long.valueOf(arr[1]) ;
        Double gia = null ;
        if(Objects.equals(now, nam)){
            gia = this.giaGoc * (1.1) ;
        }
        else if ( now - nam <= 3){
            gia = this.giaGoc * (0.9) ;
        }
        else if(now - nam > 3){
            gia = this.giaGoc * (0.8) ;
        }
        if(this.thung){
            gia = gia * 1.1 ;
        }
        return gia ; 
    }

    public String getNam() {
        String[] a = this.ngayLanBanh.split("/") ;
        return a[1] ;
    }
 
    
    @Override
    public String toString(){
        return this.ma + " " + this.hang + " " + this.ngayLanBanh + " " + this.trongTai + " " + new DecimalFormat("#.#").format(this.getGiaBan()) ;
    }
    
    
}
