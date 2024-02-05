package tinh_tien_phong;

import java.io.* ; 
import java.util.* ; 
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Customer implements Comparable<Customer>{
    private String name = "", num, id ;
    private Long days, price ;
    private static int id_n = 1 ; 

    public Customer(String name, String num, Long days, Long money) {
        String[] arr = name.trim().toLowerCase().split(("\\s+")) ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0,1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s.trim() ;
        this.id = "KH" + String.format("%02d", id_n++) ;
        this.num = num;
        this.days = days;
        if(this.num.charAt(0) == '1'){
            this.price = money + days*25 ;
        }
        else if(this.num.charAt(0) == '2'){
            this.price = money + days*34 ;
        }
        else if(this.num.charAt(0) == '3'){
            this.price = money + days*50 ;
        }
        else{
            this.price = money + days*80 ;
        }
               
    }

    public Long getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + num + " " + Long.toString(days) + " " + price ;
    }
    @Override
    public int compareTo(Customer o) {
        return -price.compareTo(o.getPrice()) ;
    }
    
}
public class Tinh_tien_phong {


    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
        File obj = new File("KHACHHANG.in") ;
        Scanner scanner = new Scanner(obj) ; 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
        int amount = Integer.parseInt(scanner.nextLine()) ;
        List<Customer> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < amount ; i++){
            String name = scanner.nextLine()  ;
            String num = scanner.nextLine().trim() ;
            Date begin = sdf.parse(scanner.nextLine()) ; 
            Date end = sdf.parse(scanner.nextLine()) ;
            Long time = (end.getTime() - begin.getTime()) / (1000 * 60 * 60 * 24) ;
            Long money = Long.parseLong(scanner.nextLine()) ;
            Customer tmp = new Customer(name, num, time + 1, money ) ;
            ls.add(tmp) ;
        }
        Collections.sort(ls);
        for(Customer x : ls){
            System.out.println(x);
        }
    }
    
}
