
package chia_het;

import java.util.Scanner ;
import java.math.BigInteger ; 
public class Chia_het {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            BigInteger a = scanner.nextBigInteger() ;
            BigInteger b = scanner.nextBigInteger() ;
            if(a.remainder(b).toString().equals("0") || b.remainder(a).toString().equals("0")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
