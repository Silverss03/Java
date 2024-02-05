/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danh_sach_doi_tuong_nv;

import java.text.DecimalFormat;
import java.util.* ; 

class Employee {
    private String id, name,gender, address, b_day, tax_n, contract_date ;
    private static int id_n = 1 ;
    public Employee(String name, String gender, String b_day, String address, String tax_n, String contract_date) {
        this.id = String.format("%05d", id_n++) ; 
        this.name = name;
        this.gender = gender;
        this.b_day = b_day;
        this.tax_n = tax_n;
        this.contract_date = contract_date;
        this.address = address ;
    }

    public String getB_day() {
        return b_day;
    }
  
    @Override
   public String toString(){
       return id + " " + name + " "  + gender + " " + b_day + " " + address + " " + tax_n + " " + contract_date;
   } 

    public String getName() {
        return name;
    }

    
}

public class Danh_sach_doi_tuong_nv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Employee> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Employee(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        ls.sort(new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                String y1 = o1.getB_day().substring(6) ;
                String y2 = o2.getB_day().substring(6) ;
                String m1 = o1.getB_day().substring(3,5) ;
                String m2 = o2.getB_day().substring(3,5) ;
                String d1 = o1.getB_day().substring(0,2) ;
                String d2 = o2.getB_day().substring(0,2) ;
                if(y1.equalsIgnoreCase(y2)){
                    if(m1.equalsIgnoreCase(m2)){
                        return d1.compareTo(d2) ;
                    }
                    else{
                        return m1.compareTo(m2) ;
                    }                  
                }
                else{
                    return y1.compareTo(y2) ;
                }
            }
            
        });
        for(Employee x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011