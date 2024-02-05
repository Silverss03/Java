/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_tien_phong_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
            this.price = money + days*200000 ;
        }
        else if(this.num.charAt(0) == '2'){
            this.price = money + days*300000;
        }
        else{
            this.price = money + days*400000 ;
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
public class Tinh_tien_phong_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File obj = new File("KHACHHANG.txt") ;
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
