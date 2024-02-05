package bang_theo_doi_nhap_xuat_hang;

import java.text.DecimalFormat;
import java.util.* ; 

class Product{
    private String id ;
    private double inp, out, price, total, tax ; 

    public Product(String id, double inp) {
        this.id = id;
        this.inp = inp;
        if(id.charAt(0) == 'A'){
            this.out = Math.round(inp *0.6) ;
            if(id.charAt(id.length() - 1) == 'Y'){
                this.price = 110000 ; 
                this.total = this.price * this.out ; 
                this.tax = this.total * 0.08 ;
            }
            else if(id.charAt(id.length() - 1) == 'N'){
                this.price = 135000 ;
                this.total = this.price * this.out ; 
                this.tax = this.total * 0.11 ;
            }
        }
        else if(id.charAt(0) == 'B'){
            this.out = Math.round(inp * 0.7)  ; 
            if(id.charAt(id.length() - 1) == 'Y'){
                this.price = 110000 ; 
                this.total = this.price * this.out ; 
                this.tax = this.total * 0.17 ;
            }
            else if(id.charAt(id.length() - 1) == 'N'){
                this.price = 135000 ;
                this.total = this.price * this.out ; 
                this.tax = this.total * 0.22 ;
            }
        }
    }

    public String getId() {
        return id;
    }

    public double getTax() {
        return tax;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#") ;
        return id + " " + df.format(inp) + " " + df.format(out) + " " + df.format(price) + " " + df.format(total) + " " + df.format(tax) ;
    }
    
    
}
public class Bang_theo_doi_nhap_xuat_hang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Product>ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Product(scanner.nextLine(), Double.parseDouble(scanner.nextLine()))) ;
        }
        String code = scanner.nextLine() ;
        ls.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getTax(), o1.getTax()) ;
            }
            
        });
        for(Product x : ls){
            if(x.getId().contains(code))
                System.out.println(x);
        }
    }    
}


//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582