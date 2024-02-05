package danh_sach_don_hang;

import java.math.BigInteger;
import java.util.* ; 

class Product{
    private String id, name, unit ; 
    private BigInteger buy, sell, profit ;
    private static int  id_n = 1 ;

    public Product(String name, String unit, BigInteger buy, BigInteger sell) {
        this.id = "DH" + String.format("%03d", id_n++) ; 
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell.subtract(buy) ;
    }

    public BigInteger getProfit() {
        return profit;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + buy + " " + sell + " " + profit ;
    }
    
    
    
}
public class Danh_sach_don_hang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Product> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Product(scanner.nextLine(), scanner.nextLine(), new BigInteger(scanner.nextLine()) , new BigInteger(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                if(!o1.getProfit().equals(o2.getProfit()) )
                    return o2.getProfit().compareTo(o1.getProfit()) ;
                else
                    return o1.getId().compareTo(o2.getId()) ;
            }
            
        });
        for(Product x : ls){
            System.out.println(x);
        }
    }
    
}
