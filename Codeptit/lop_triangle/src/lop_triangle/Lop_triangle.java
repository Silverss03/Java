/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lop_triangle;

import java.io.*;
import java.util.*;

import java.util.*;

class Point{
    private double x, y ;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble() ;
        double y = sc.nextDouble() ;
        return new Point(x, y) ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        double a = Math.abs(this.x - secondPoint.getX()) ;
        double b = Math.abs(this.y - secondPoint.getY()) ;
        return Math.sqrt(a*a+b*b) ;
    }
    
    public double distance(Point p1, Point p2){
        double a = Math.abs(p1.getX() - p2.getX()) ;
        double b = Math.abs(p1.getY() - p2.getY()) ;
        return Math.sqrt(a*a+b*b) ;
    }
    
    
    public String toString(){
        return String.valueOf(this) ;
    }
}

class Triangle{
    Point p1, p2, p3 ; 

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public boolean valid(){
        double ab = p1.distance(p2) ;
        double ac = p1.distance(p3) ; 
        double bc = p2.distance(p3) ;
        return !(ab + ac <= bc || ab + bc <= ac || bc + ac <= ab) ;
    }
    
    public String getPerimeter(){
        double ab = p1.distance(p2) ;
        double ac = p1.distance(p3) ; 
        double bc = p2.distance(p3) ;
        String res = String.format("%.3f", ab + bc + ac) ;
        return res ;
    }
    
}
public class Lop_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    
}
