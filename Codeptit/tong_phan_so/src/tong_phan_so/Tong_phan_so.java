/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tong_phan_so;

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

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    
    
    public void add(Fraction b){
        long n_mau = (mau * b.mau)/gcd(mau, b.mau) ;
        long mul1 = n_mau/mau ;
        long mul2 = n_mau/b.mau ;
        tu = tu* mul1 + b.tu*mul2 ;
        mau = n_mau ;
    }
    
}

public class Tong_phan_so {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        Fraction a = new Fraction(scanner.nextLong(), scanner.nextLong()) ;
        Fraction b = new Fraction(scanner.nextLong(), scanner.nextLong()) ;
        a.add(b) ;
        a.out() ;
    }
    
}
