package phan_tich_thua_so_nguyen_to;

import java.util.Arrays;
import java.util.Scanner ;
import java.util.ArrayList ;

public class Phan_tich_thua_so_nguyen_to {

    public static Scanner scanner = new Scanner(System.in) ;
    
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        for(int t = 1 ; t <= tests ; t++){
            int n = scanner.nextInt() ;
            int lim = (int)(Math.sqrt(n)) ;
            System.out.print("Test " + t + ": ");
            if(n % 2 == 0){
                int count = 0 ;
                while(n % 2 == 0){
                    count++ ;
                    n /= 2 ;
                }
                System.out.print(2 + "(" +count + ") ");
            }
            for(int i = 3 ; i <=  lim; i += 2){
                if(n % i == 0){
                    int count = 0 ; 
                    while(n % i == 0){
                        count++ ;
                        n /= i ;
                    }
                    System.out.print(i + "(" + count + ") ");
                }
            }
            if(n > 1){
                System.out.print(n + "(" + 1 + ")");
            }
            System.out.println();
        }
    }
    
}
