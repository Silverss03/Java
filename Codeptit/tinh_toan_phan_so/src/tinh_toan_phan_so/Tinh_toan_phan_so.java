/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_toan_phan_so;

import java.io.*;
import java.util.*;

class Fraction{
    private long nume, denom ;

    public Fraction(long nume, long denom) {
        this.nume = nume;
        this.denom = denom;
    }

    public long getNume() {
        return nume;
    }

    public void setNume(long nume) {
        this.nume = nume;
    }

    public long getDenom() {
        return denom;
    }

    public void setDenom(long denom) {
        this.denom = denom;
    }

    public long GCD(long a, long b){
        if(b == 0) return a ;
        return GCD(b, a%b) ;
    }
    
    public Fraction plus(Fraction b){
        long n_denum =(this.denom * b.getDenom()) /GCD(this.denom, b.getDenom()) ;
        long n_nume = this.nume * (n_denum/this.denom) + b.getNume() * (n_denum/b.getDenom()) ;
        return new Fraction(n_nume * n_nume, n_denum * n_denum) ;
    }
    
    public Fraction multiply(Fraction b, Fraction c){
        long n_denum = this.denom * b.getDenom() * c.getDenom() ;
        long n_nume = this.nume * b.getNume() * c.getNume() ;
        return new Fraction(n_nume, n_denum) ;
    }
    
    public void simplify(){
        long div = GCD(this.denom, this.nume) ;
        this.nume /= div ; 
        this.denom /= div ;
//        if(this.denom < 0){
//            this.denom *= -1;
//            this.nume *= -1 ;
//        }
    }
    @Override
    public String toString() {
        return  nume + "/" + denom ;
    }
    
    
}

public class Tinh_toan_phan_so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.valueOf(scanner.nextLine());

        while(tests-- > 0){
            Fraction a = new Fraction(scanner.nextInt(), scanner.nextInt()) ;
            Fraction b = new Fraction(scanner.nextInt(), scanner.nextInt()) ;
            Fraction c = a.plus(b) ;
            c.simplify();
            Fraction d = (c.multiply(b, a)) ;
            d.simplify();
            System.out.println(c + " " + d);
        }
        scanner.close();
    }
    
}
