package chia_het_2;

import java.util.* ;
import java.math.BigInteger ;
public class Chia_het_2 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ; 
        while(tests-- > 0){
            BigInteger a = scanner.nextBigInteger() ;
            BigInteger b = scanner.nextBigInteger() ;
            BigInteger c = scanner.nextBigInteger() ;
            if(a.remainder(c).toString().equals("0") && b.remainder(c).toString().equals("0")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
