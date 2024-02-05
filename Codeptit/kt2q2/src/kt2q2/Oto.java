/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q2;

/**
 *
 * @author Admin
 */
public class Oto extends PTGT{
    private String engine ; 
    private int seats ;

    public Oto( String hang, String nam, Double gia, String mau, String engine, int seats) {
        super(hang, nam, gia, mau) ;
        this.engine = engine;
        this.seats = seats;
    }

    public void setMa() {
        this.ma = String.format("OTO-%03d", id_n++);
    }

    
    
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    @Override
    public String toString(){
        return super.getMa() + " " + super.getHang() + " " + super.getNam() + " " + super.getMau() + " " + super.getGia() + " " + engine + " " + seats ;
    }
}
