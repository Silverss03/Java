package tinh_thu_nhap_giao_vien;

import java.util.Scanner ; 
import java.math.BigInteger ; 

public class Tinh_thu_nhap_giao_vien {

    public static Scanner scanner = new Scanner(System.in) ; 
    public static void main(String[] args) {
        String code = scanner.nextLine() ; 
        String name = scanner.nextLine() ; 
        BigInteger sal = scanner.nextBigInteger() ;
        String position = code.substring(0,2) ;
        BigInteger mul = new BigInteger(code.substring(2)) ;
        sal = sal.multiply(mul)  ;
        BigInteger a ;
        if(position.equals("HT")){
            a = new BigInteger("2000000") ;
        }
        else if(position.equals("HP")){
            a = new BigInteger("900000") ;
        }
        else{
            a= new BigInteger("500000") ;
        }
        sal = sal.add(a) ;
        System.out.println(code+ " " + name + " " + mul + " " + a + " " + sal);
    }
    
}
