package tong_so_nguyen_lon;

import java.math.BigInteger;
import java.util.* ; 

public class Tong_so_nguyen_lon {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in) ;
        BigInteger p1 = scanner.nextBigInteger() ;
        BigInteger p2 = scanner.nextBigInteger() ;
        BigInteger p3 = p1.add(p2) ;
        System.out.println(p3);
    }
    
}
