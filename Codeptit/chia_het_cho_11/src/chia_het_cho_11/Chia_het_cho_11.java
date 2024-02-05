package chia_het_cho_11;

import java.math.BigInteger;
import java.util.* ; 

public class Chia_het_cho_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.valueOf(scanner.nextLine()) ;
        while(tests-- > 0){
            BigInteger a = scanner.nextBigInteger() ;
            if(a.remainder(new BigInteger("11")).equals(new BigInteger("0"))){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
    
}
