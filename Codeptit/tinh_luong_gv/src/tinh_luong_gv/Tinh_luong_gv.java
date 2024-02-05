
package tinh_luong_gv;

import java.util.* ;
import java.math.BigInteger ;
public class Tinh_luong_gv {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String id = scanner.nextLine() ;
        String name = scanner.nextLine() ; 
        BigInteger sal = scanner.nextBigInteger() ;
        String tmp = scanner.nextLine() ;
        String rank = scanner.nextLine();
        BigInteger  x1 = new BigInteger("2" ); 
        BigInteger x2 = new BigInteger("5") ;
        BigInteger x3 = new BigInteger("250000") ;
        if(rank.equals("A")){   
            sal = sal.multiply(x3).add(sal.multiply(x3).divide(x1)) ;
        }
        else if(rank.equals("B")){
            sal = sal.multiply(x3).add(sal.multiply(x3).divide(x2)) ;  
        }
        else{
            sal = sal.multiply(x3) ;
        }
        System.out.println(id + " " + name + " " + rank + " " +sal );
    }
    
}
