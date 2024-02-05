package quan_ly_ban_hang;

import java.util.* ;

class Employee{
    private String name, gender, b_day, address, product ; 

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProduct() {
        return product;
    }

    public Employee(String name, String gender, String b_day, String address, String product) {
        this.name = name;
        this.gender = gender;
        this.b_day = b_day;
        this.address = address;
        this.product = product;
    }
    
}

class Customer{
    private String id, name, gender, b_day, address ; 
    private static int id_n = 1; 

    public Customer(String name, String gender, String b_day, String address) {
        this.id = "KH" + String.format("%03d", id_n++) ; 
        this.name = name;
        this.gender = gender;
        this.b_day = b_day;
        this.address = address;
    }   

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public Customer get_Cus(){
        return this ;
    }
}

class Product{
    private String id, name, unit ;
    private Employee e ;
    private int buy, sell ; 
    private static int id_n = 1 ;

    public Product(String name, String unit, int buy, int sell) {
        this.id = "MH" + String.format("%03d", id_n++) ;    
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public Employee getE() {
        return e;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }

    public Product get_pro(){
        return this ; 
    }
}

class Bill{
    private String id, cus_id, product_id ; 
    private Customer cus ;
    private Product p ;
    private int num ; 
    private static int id_n = 1 ;

    public Bill( String cus_id, String product_id, int num) {
        this.id = "HD" + String.format("%03d", id_n++);
        this.cus_id = cus_id;
        this.product_id = product_id;
        this.num = num;
    }

    public String getCus_id() {
        return cus_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public void setP(Product p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return  id + " " + cus.getName() + " " + cus.getAddress() + " " 
                + p.getName() + " " + p.getUnit() 
                + " " + p.getE().getName() + " " + p.getE().getAddress() + " " 
                + p.getBuy() + " " + p.getSell() + " " + num + " " + p.getSell() * num ;
    }
    
    
}
public class Quan_ly_ban_hang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int m = Integer.parseInt(scanner.nextLine()) ;
        List<Employee> l_emp = new ArrayList<>() ; 
        for(int i = 0 ; i < m ; i++){
            l_emp.add(new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
        }
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Customer> l_cus = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            l_cus.add(new Customer(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
        }
        int p = Integer.parseInt(scanner.nextLine()) ;
        List<Product> l_pro = new ArrayList<>() ;
        for(int i = 0 ; i < p ; i++){
            l_pro.add(new Product(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()))) ;
        }
        int q = Integer.parseInt(scanner.nextLine()) ;
        List<Bill> l_bill = new ArrayList<>() ; 
        for(int i = 0 ; i < q ; i++){
            l_bill.add(new Bill( scanner.next(), scanner.next(), scanner.nextInt())) ;
        }
        for(Employee x : l_emp){
            for(Product y : l_pro){
                if(y.getId().equals(x.getProduct())){
                    y.setE(x); 
                    break ;
                }
            }
        }
        for(Bill x : l_bill){
            for(Customer y : l_cus){
                if(x.getCus_id().equals(y.getId())){
                    x.setCus(y);
                    break ;
                }
            }
            for(Product y : l_pro){
                if(x.getProduct_id().equals(y.getId())){
                    x.setP(y);
                    break ;
                }
            }
        }
        for(Bill x : l_bill){
            System.out.println(x);
        }
    }
    
}
