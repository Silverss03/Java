
package uoc_so_chia_het_cho_2;

import java.util.Scanner ;
public class Uoc_so_chia_het_cho_2 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            int n = scanner.nextInt() ;
            if(n % 2 != 0){
                System.out.println("0");
            }
            else{
                int count = 0, div = 0;
                while(n % 2 == 0){
                    count++ ;
                    n /= 2 ;
                }
                int tmp = n ;
                for(int i = 1 ; i <= Math.sqrt(tmp) ; i+=2){
                    if(n % i == 0){
                        div++ ;                      
                    }
                }
                if((int)Math.sqrt(tmp) == Math.sqrt(tmp)){
                    div = div * 2 - 1 ;
                }
                else{
                    div *= 2 ;
                }
                System.out.println(count * div);
            }
        }
    }
    
}
