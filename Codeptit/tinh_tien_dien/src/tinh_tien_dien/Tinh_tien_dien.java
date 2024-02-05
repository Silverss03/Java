package tinh_tien_dien;

import java.io.* ; 
import java.util.* ; 
import java.text.DecimalFormat;

class Customer implements Comparable<Customer>{
    private String name, id ;
    private Double in, out, sum, lim,tax ; 
    private static int id_n = 1 ;

    public Customer(String name, Double in, Double out, String lim) {
        String[] arr = name.trim().toLowerCase().split(("\\s+")) ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0,1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s.trim() ;
        this.id = "KH" + String.format("%02d", id_n++) ;
        if(lim.equalsIgnoreCase("A")){
            this.lim = 100D ;
        }
        else if(lim.equalsIgnoreCase("B")){
            this.lim = 500D ; 
        }
        else{
            this.lim = 200D ;
        }
        Double amount = out - in ; 
        if(amount > this.lim){
            this.in = 450 * this.lim ;  
            this.out = 1000 * (amount - this.lim) ;
            tax = out * 0.05 ;
        }
        else{
            this.in = amount * 450 ; 
            this.out = 0D ;
            tax = 0D ;
        }
        this.sum = this.in + this.out + this.tax ; 
        
    }

    public Double getSum() {
        return sum;
    }

    @Override
    public String toString(){
        DecimalFormat form = new DecimalFormat("#.#") ;
        return id + " " + name + " " + form.format(this.in) + " " + form.format(this.out) + " " + form.format(this.tax) + " " + form.format(this.sum) ;
    }
    @Override
    public int compareTo(Customer o) {
        return -sum.compareTo(o.getSum()) ;
    }
    
    
}
public class Tinh_tien_dien {


    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("KHACHHANG.in") ;
        Scanner scanner = new Scanner(obj) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Customer> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ;
            String[] line = scanner.nextLine().split("\\s+") ;
            String type = line[0] ;
            Double in = Double.parseDouble(line[1]) ;
            Double out = Double.parseDouble(line[2]) ;
            ls.add(new Customer(name, in, out, type)) ;
        }
        Collections.sort(ls);
        for(Customer x : ls){
            System.out.println(x);
        }
    }
    
}
