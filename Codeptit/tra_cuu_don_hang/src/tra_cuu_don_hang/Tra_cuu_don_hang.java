package tra_cuu_don_hang;

import java.text.DecimalFormat;
import java.util.* ; 

class Product{
    private String id, name, num ;
    private double discount, total;

    public Product(String name, String id, double price, double amount) {
        this.name = name;
        this.id = id;
        this.num = id.substring(1, 4) ;
        char c = id.charAt(id.length() - 1) ;
        if(c == '1'){
            this.discount = 0.5 * price * amount ;
        }
        else if(c == '2'){
            this.discount = 0.3 * price * amount ; 
        }
        this.total = price * amount - this.discount ;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }
    
    

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#") ;
        return name + " " + id + " " + num + " " + df.format(discount) + " " + df.format(total) ;
    }
    
    
}
public class Tra_cuu_don_hang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Product> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Product(scanner.nextLine(), scanner.nextLine(),
        Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getNum().compareTo(o2.getNum()) ;
            }
           
        });
        for(Product x : ls){
            System.out.println(x);
        }
    }   
}

//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12