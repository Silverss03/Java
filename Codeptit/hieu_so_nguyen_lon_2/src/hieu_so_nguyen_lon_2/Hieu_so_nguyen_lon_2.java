
package hieu_so_nguyen_lon_2;

import java.util.* ; 
import java.math.BigInteger ;
public class Hieu_so_nguyen_lon_2 {
    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        BigInteger a = scanner.nextBigInteger() ;
        BigInteger b = scanner.nextBigInteger() ;
        BigInteger c = a.subtract(b) ;
        System.out.print(c.toString());
        
    }        
    
}
