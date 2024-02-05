
package phan_so;

import java.util.Scanner ;

class Fraction{
    private long tu, mau ;
    public long gcd(long a, long b){
        if(b == 0) return a ;
        return gcd(b, a%b) ;
    }

    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public void out(){
        long c = gcd(tu, mau) ;
        long a = tu/c ;
        long b = mau/c ;
        System.out.println(a + "/" + b);
    }
}

public class Phan_So {

    public static Scanner scanner = new Scanner(System.in) ; 
    public static void main(String[] args) {
        long a = scanner.nextLong() ;
        long b = scanner.nextLong() ;
        Fraction tmp = new Fraction(a, b) ;
        tmp.out();
    }
    
}
