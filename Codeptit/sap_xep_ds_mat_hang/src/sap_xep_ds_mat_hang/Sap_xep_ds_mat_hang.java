/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_xep_ds_mat_hang;

import java.text.DecimalFormat;
import java.util.* ; 

class Product{
    private String id, name, type ;
    private static int id_n = 1; 
    private double profit ;

    public Product(String name, String type, double buy, double sell) {
        this.id = Integer.toString(id_n++) ;
        this.name = name;
        this.type = type;
        this.profit = sell - buy ;
    }

    public double getProfit() {
        return profit;
    }
    
    
    public String toString(){
        return id + " " + name + " " + type + " " + String.format("%.2f",profit) ;
    }
}
public class Sap_xep_ds_mat_hang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Product> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Product(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getProfit(), o1.getProfit()) ;
            }
            
        });
        for(Product x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37