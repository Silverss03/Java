package tinh_tien_dien_2;

import java.text.DecimalFormat;
import java.util.* ;

class Customer{
    private String id ;
    private double coefficient, price, exceed, total ;
    private static int id_n = 1; 

    public Customer(String type, double old_static, double new_static) {
        this.id = "KH" + String.format("%02d", id_n++) ; 
        if(type.equals("KD")){
            this.coefficient = 3 ;
        }
        else if(type.equals("NN")){
            this.coefficient = 5 ;
        }
        else if(type.equals("TT")){
            this.coefficient = 4 ; 
        }
        else{
            this.coefficient = 2 ;
        }
        double s = new_static - old_static ;
        this.price = s * this.coefficient * 550 ;
        if(s > 100){
            this.exceed = this.price ;
        }
        else if(s >= 50){
            this.exceed = Math.ceil(this.price * 0.35) ;
        }
        else{
            this.exceed = 0 ; 
        }
        this.total = this.exceed + this.price ; 
    }

    public String getId() {
        return id;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public double getPrice() {
        return price;
    }

    public double getExceed() {
        return exceed;
    }

    public double getTotal() {
        return total;
    }

    public static int getId_n() {
        return id_n;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#") ;
        return id + " " + df.format(coefficient) + " " + df.format(price) + " " + df.format(exceed) + " " + df.format(total) ;
    }
    
    
    
}

public class Tinh_tien_dien_2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Customer> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Customer(scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Customer>(){
            @Override
            public int compare(Customer o1, Customer o2) {
                return Double.compare(o2.getTotal(), o1.getTotal()) ;
            }
            
        });
        for(Customer x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700