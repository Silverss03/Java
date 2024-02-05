package danh_sach_san_pham_2;

import java.util.* ; 
import java.io.* ;

class Product implements Comparable<Product>{
    private String id, name ;
    private Long price, time ;

    public Product(String id, String name, Long price, Long time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public Long getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    
    
    @Override
    public String toString(){
        return id + " " + name + " " + price + " " + time ;
    }
    @Override
    public int compareTo(Product o) {
        if(price != o.getPrice())
            return -price.compareTo(o.getPrice()) ;
        else 
            return id.compareTo(o.getId() );
    }
    
}
public class Danh_sach_san_pham_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("SANPHAM.in") ;
        Scanner scanner = new Scanner(obj) ; 
        int num = Integer.parseInt(scanner.nextLine()) ;
        List<Product> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < num ; i++){
            String id = scanner.nextLine() ;
            String name = scanner.nextLine() ;
            Long price = Long.valueOf(scanner.nextLine()) ; 
            Long time = Long.valueOf(scanner.nextLine()) ;
            ls.add(new Product(id, name, price, time)) ;
        }
        Collections.sort(ls);
        for(Product x : ls){
            System.out.println(x);
        }
    }
    
}
