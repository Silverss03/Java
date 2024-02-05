/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q6;

/**
 *
 * @author Admin
 */
public class GDVang extends GiaoDich implements IThanhTien{
    private String type ;
    private static int gold_id_n = 1 ;

    public GDVang(String date, double price, int amount, String type) {
        super(date, price, amount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type ;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId() {
        this.id = String.format("V-%03d", id_n++) ;
    }

    @Override
    public double getThanhTien() {
        return amount * price ;
    }

        @Override
    public String toString(){
        return id + "\t" + date + "\t" + price + "\t" + amount + "\t" + type + "\t" + getThanhTien();
        
    }
    
}
