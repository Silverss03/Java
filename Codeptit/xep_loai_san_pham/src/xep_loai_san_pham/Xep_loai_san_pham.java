package xep_loai_san_pham;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product{
    private String name, id, status ;
    private Integer amount ;
    private Double price, inc ;
    private static int id_n = 1 ; 

    public Product(String name, String id, Integer amount, Double price) {
        this.name = name ; 
        this.id = String.format(id + "%03d", id_n++) ; 
        this.amount = amount ;
        this.price = price ;
        this.inc = this.price * amount ; 
        if(id.equalsIgnoreCase("A")){
            this.inc = inc * 0.9 ;
        }
        else if(id.equalsIgnoreCase("B")){
            this.inc = inc * 0.95 ; 
        }
        if(amount > 50){
            this.status = "ban nhanh" ;
        }
        else if(amount >= 30 && amount <= 50){
            this.status = "ban" ; 
        }
        else{
            this.status = "ngung ban" ; 
        }
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " +this.amount + " " + new DecimalFormat("#.#").format(this.price )+ " " + new DecimalFormat("#.#").format(this.inc) + " " + this.status;
    }
    
}
public class Xep_loai_san_pham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File obj = new File("sanpham.dat") ;
        List<Product> ls = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            for(int i = 0 ; i < n ; i++){
                String name = scanner.nextLine().trim() ; 
                String id = scanner.nextLine().trim();
                String[] arr = scanner.nextLine().split("\\s+") ;
                ls.add(new Product(name, id, Integer.valueOf(arr[0].trim()), Double.valueOf(arr[1].trim()))) ;
            }
            for(Product x : ls){
                System.out.println(x);
            }
         }
        catch(FileNotFoundException e){
            
        }
    }
    
}
