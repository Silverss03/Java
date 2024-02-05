package chia_het_cho_7;

import java.math.BigInteger;
import java.util.* ;
public class Chia_het_cho_7 {

    public static BigInteger rev(BigInteger x){
        String s = x.toString() ; 
        String res = "" ; 
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            res += s.charAt(i) ;
        }
        return new BigInteger(res) ;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            BigInteger n = new BigInteger(scanner.nextLine()) ;
            int steps = 0 ; 
            boolean flag = false ; 
            while(true){
                if(steps > 500){
                    break ; 
                }
                BigInteger[] x = n.divideAndRemainder(new BigInteger("7")) ;
                if(x[1].equals(new BigInteger("0"))){
                    System.out.println(n);
                    break ;
                }
                n = n.add(rev(n)) ;
                steps++ ;
            }
            if(steps > 500){
                System.out.println("-1");
            }
        }
    }
    
}
