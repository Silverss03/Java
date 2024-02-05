package tinh_gia_ban;

import java.text.DecimalFormat;
import java.util.* ; 

class Product{
    private String id, name, unit ;
    private static int id_n = 1; 
    private double moving, total, sell ; 

    public Product(String name, String unit, double buy, double amount) {
        this.id = "MH" + String.format("%02d", id_n++) ; 
        this.name = name;
        this.unit = unit;
        this.moving = Math.round((buy * amount) * 0.05) ; 
        this.total = moving + buy * amount ; 
        this.sell = Math.ceil((this.total * 1.02)/amount/100) * 100 ;
    }

    public double getSell() {
        return sell;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + new DecimalFormat("#.#").format(moving) + " " + new DecimalFormat("#.#").format(total) + " " + new DecimalFormat("#.#").format(sell) ;
    }
    
    
}
public class Tinh_gia_ban {

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
                return Double.compare(o2.getSell(), o1.getSell()) ;
            }
            
        });
        for(Product x : ls){
            System.out.println(x);
        }
        
    }
    
}

//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430