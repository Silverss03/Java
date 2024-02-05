/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_phuc;

import java.io.*;
import java.util.*;

class Complex_num{
    private long real, imaginary ;

    public Complex_num(long real, long imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public long getReal() {
        return real;
    }

    public void setReal(long real) {
        this.real = real;
    }

    public long getImaginary() {
        return imaginary;
    }

    public void setImaginary(long imaginary) {
        this.imaginary = imaginary;
    }
    
    public Complex_num plus(Complex_num a){
        long n_real = this.real + a.getReal() ;
        long n_imaginary = this.imaginary + a.getImaginary() ;
        return new Complex_num(n_real, n_imaginary) ;
    }
    
    public Complex_num multiply(Complex_num b){
        long n_real = this.real * b.getReal() - this.imaginary * b.getImaginary() ;
        long n_imaginary = this.real * b.getImaginary() + this.imaginary * b.getReal() ;
        return new Complex_num(n_real, n_imaginary) ;
    }
    
    public String toString(){
        if(imaginary < 0){
            imaginary *= -1 ; 
            return real + " - " + imaginary + "i" ;
        }
        return real + " + " + imaginary + "i"; 
    } 
}

public class So_phuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.valueOf(scanner.nextLine());

        while(tests-- != 0){
            Complex_num a = new Complex_num(scanner.nextLong(), scanner.nextLong()) ;
            Complex_num b = new Complex_num(scanner.nextLong(), scanner.nextLong()) ;            
            Complex_num c = a.plus(b) ;
            System.out.print(c.multiply(a) + ", ");      
            System.out.println(c.multiply(c));
        }

        scanner.close();
    }
    
}
