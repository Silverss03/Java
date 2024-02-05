package tong_va_hieu;

import java.math.BigInteger;
import java.util.* ;


public class Tong_va_hieu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        BigInteger a = new BigInteger(scanner.next()) ;
        BigInteger b = new BigInteger(scanner.next()) ;
        BigInteger x = a.add(b).divide(new BigInteger("2")) ;
        BigInteger y = a.subtract(x) ;
        if(x.add(y).equals(a) && x.subtract(y).equals(b)){
            System.out.println(x + " " + y);
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
    
}
