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
public class Oto extends PTGT implements IPTGT{
    private int soCho ;
    private double dongCo ;

    public Oto() {
    }

    public Oto(String hang,String ngayLanBanh, double giaGoc, int soCho, double dongCo ) {
        super(hang, ngayLanBanh, giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public void setMa() {
        super.setMa() ;
        String code = this.hang.substring(0, 2).toUpperCase() ; 
        this.ma = code + "-" + super.getMa() ;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.hang + " " + this.ngayLanBanh + " " + this.soCho + " " + new DecimalFormat("#.#").format(this.getGiaBan()) ;
    }

    @Override
    public double getGiaBan() {
        Year tmp = Year.now() ;
        Long now = Long.valueOf(tmp.toString()) ;
        String[] arr = this.ngayLanBanh.split("/") ;
        Long nam = Long.valueOf(arr[1]) ;
        Double gia ;
        if(Objects.equals(now, nam)){
            gia = this.giaGoc * (1.1) ;
        }
        else if ( now - nam <= 2){
            gia = this.giaGoc * (0.9) ;
        }
        else if(now - nam <= 5){
            gia = this.giaGoc * (0.8) ;
        }
        else{
            gia = this.giaGoc * (0.7) ;
        }
        return gia ; 
    }
    
    
}
