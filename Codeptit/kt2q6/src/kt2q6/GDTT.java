/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q6;

public class GDTT extends GiaoDich implements IThanhTien{
    private double ex_rate ;
    private String currency ; 

    public GDTT(String date,  double price, int amount,double ex_rate, String currency) {
        super(date, price, amount);
        this.ex_rate = ex_rate;
        this.currency = currency.toUpperCase();
    }

    public double getEx_rate() {
        return ex_rate;
    }

    public void setEx_rate(double ex_rate) {
        this.ex_rate = ex_rate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId() {
        this.id = String.format("TT-%03d", id_n++);
    }

    @Override
    public double getThanhTien() {
        if(currency.equalsIgnoreCase("VND")){
            return amount * price  ;
        }            
        else{
            return amount * price * ex_rate; 
        }
    }
    
    @Override
    public String toString(){
        return id + "\t" + date + "\t" + price + "\t" + amount + "\t" + currency + "\t" + ex_rate + "\t" + getThanhTien() ;
    }
    
}
