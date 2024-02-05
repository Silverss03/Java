package kiem_tra_so_fibonacci;

import java.util.Scanner ;
public class Kiem_tra_so_fibonacci {

    public static Scanner scanner = new Scanner(System.in) ;
    
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        long fib[] = new long[95] ;
        fib[1] = 0 ;
        fib[2] = 1 ;
        for(int i = 3 ; i <= 93 ; i++){
            fib[i] = fib[i - 1] + fib[i - 2] ;
        }
        while(tests-- > 0){
            long n = scanner.nextLong() ;
            boolean res = false ;
            for(long i : fib){
                if(i == n){
                    res = true ;
                }
            }
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
