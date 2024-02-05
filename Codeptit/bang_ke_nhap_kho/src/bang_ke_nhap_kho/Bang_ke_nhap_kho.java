/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bang_ke_nhap_kho;
import java.text.DecimalFormat;
import java.util.* ; 
class Product{
    private String id, name ;
    private double discount, total ; 

    public Product(String id, String name, double amount, double price) {
        this.id = id ; 
        this.name = name;
        this.discount = amount * price ; 
        if(amount > 10){
            this.discount *= 0.05 ;
        }
        else if(amount >= 8){
            this.discount *= 0.02 ; 
        }
        else if(amount >= 5){
            this.discount *= 0.01 ;
        }
        else{
            this.discount = 0 ;
        }
        this.total = amount * price - this.discount ;
    }

    public double getDiscount() {
        return discount;
    }

    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#") ;
        return id + " " + name + " " + df.format(discount) + " " + df.format(total) ;
    }
    
    
}


public class Bang_ke_nhap_kho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Product> ls = new ArrayList<>() ;
        Map<String, Integer> mp = new HashMap<>() ; 
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine();
            String[] arr = name.split("\\s+") ;
            String tmp = "" ;
            for(int j = 0 ; j < 2 ; j++){
                tmp += arr[j].substring(0, 1).toUpperCase() ;
            }
            if(mp.containsKey(tmp)){
                int amount = mp.get(tmp) + 1 ;
                mp.put(tmp,amount ) ;
                tmp += String.format("%02d", amount) ;
            }
            else{
                mp.put(tmp, 1) ;
                tmp += String.format("%02d", 1) ;
            }
            double amount = Double.parseDouble(scanner.nextLine());
            double price = Double.parseDouble(scanner.nextLine());
            ls.add(new Product(tmp, name, amount, price)) ;
        }
        ls.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getDiscount(), o1.getDiscount()) ;
            }
            
        });
        for(Product x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000