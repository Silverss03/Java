/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_cuoc_dt_co_dinh_1;

import java.text.DecimalFormat;
import java.util.* ;

class Province{
    private String id, name ; 
    private double price ; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Province(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    
}

class Call{
    private String in, status;
    private List<Province> ls ;
    private double price, mins ; 
    
    public Call(String in, String start, String end, List<Province> ls) {
        this.in = in;
        this.ls = ls ; 
        this.mins = Integer.parseInt(end.substring(0, 2)) * 60 + Integer.parseInt(end.substring(3)) 
                - Integer.parseInt(start.substring(0, 2)) * 60 - Integer.parseInt(start.substring(3));
        if(this.in.charAt(0) == '0'){
            for(Province x : ls){
                if(x.getId().equals(in.substring(1, 3))){
                    this.status = x.getName() ;
                    this.price = x.getPrice() * this.mins ;
                }
            }
        }
        else{
            this.status = "Noi mang" ;
            this.mins = Math.ceil(this.mins/3) ;
            this.price = this.mins * 800 ;
        }
    }

    @Override
    public String toString() {
        return  in + " " + status+ " " +new DecimalFormat("#.#").format(mins) + " " + new DecimalFormat("#.#").format(price)  ;
    }
    
    
    
}
public class Tinh_cuoc_dt_co_dinh_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int provinces = Integer.parseInt(scanner.nextLine()) ;
        List<Province> ls = new ArrayList<>() ;
        for(int i = 0 ; i < provinces ; i++){
            ls.add(new Province(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()))) ;
        }
        int calls = Integer.parseInt(scanner.nextLine()) ; 
        for(int i = 0 ; i < calls ; i++){
            System.out.println(new Call(scanner.next(), scanner.next(), scanner.next(), ls));
        }
    }
    
}

//2
//53
//Da Nang
//3000
//64
//Vung Tau
//1000
//3
//064-824531 11:20 11:22
//8293567 09:07 09:15
//053-823532 12:00 12:05