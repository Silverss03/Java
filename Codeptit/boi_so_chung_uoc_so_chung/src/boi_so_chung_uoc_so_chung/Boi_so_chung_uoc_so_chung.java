package boi_so_chung_uoc_so_chung;

import java.util.Scanner ;
public class Boi_so_chung_uoc_so_chung {

    public static Scanner scanner = new Scanner(System.in) ;
    public static long GCD(long a, long b){
        if(b == 0L) return a ;
        return GCD(b, a%b) ;
    }
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- >0){
            long p = scanner.nextLong() ;
            long q = scanner.nextLong() ;
            System.out.println((p*q)/GCD(p,q) + " " + GCD(p,q));
        }
    }
    
}
