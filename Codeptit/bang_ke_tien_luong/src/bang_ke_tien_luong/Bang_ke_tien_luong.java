/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bang_ke_tien_luong;

import java.text.DecimalFormat;
import java.util.* ; 

class Employee{
    private String id, name, pos ;
    private static int id_n = 1 ; 
    private double days, monthly_sal, prize, bonus, total ; 
    private static double all = 0 ; 

    public Employee(String name, double sal, double days, String pos) {
        this.id = "NV" + String.format("%02d", id_n++) ;
        this.name = name;
        this.pos = pos;
        this.days = days;
        this.monthly_sal = sal * days;
        if(days >= 25){
            this.prize = monthly_sal * 0.2 ; 
        }
        else if(days >= 22){
            this.prize = monthly_sal * 0.1 ; 
        }
        else{
            this.prize = 0 ; 
        }
        if(pos.equalsIgnoreCase("GD")){
            this.bonus = 250000 ;
        }
        else if(pos.equalsIgnoreCase("PGD")){
            this.bonus = 200000 ;
        }
        else if(pos.equalsIgnoreCase("TP")){
            this.bonus = 180000 ;
        }
        else{
            this.bonus = 150000 ;
        }
        this.total = this.monthly_sal + this.bonus + this.prize;
        all += this.total ; 
    }

    public static double getAll() {
        return all;
    }

    public Employee(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    
    @Override
    public String toString() {
        return  id + " " + name + " " + new DecimalFormat("#.#").format(monthly_sal) + " " + new DecimalFormat("#.#").format(prize) + " " + new DecimalFormat("#.#").format(bonus) + " " + new DecimalFormat("#.#").format(total) ;
    }
    
    
}
public class Bang_ke_tien_luong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Employee> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ;i++){
            ls.add(new Employee(scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), scanner.nextLine()));
        }
        ls.sort(new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getTotal(), o1.getTotal()) ;
            }
        
        });
        for(Employee x : ls){
            System.out.println(x);
        }
        //System.out.println("Tong chi phi tien luong: " + new DecimalFormat("#.#").format(Employee.getAll()));
    }
    
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV

//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV