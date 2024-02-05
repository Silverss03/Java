/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dien_tich_hinh_tron_ngoai_tiep_tg;

import java.util.* ;

class Point{
    private double x, y ;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.getX() ;
        this.y = p.getY() ;
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

public class Dien_tich_hinh_tron_ngoai_tiep_tg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());

        while(tests-- > 0){     
            Point a = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            Point b = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            Point c = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            double ab,bc,ac;
            ab = a.distance(b);
            bc = b.distance(c);
            ac = a.distance(c);   
            if((ab + bc > ac) && (ab + ac > bc) && (bc + ac) > ab){
                Double x = Math.sqrt((ab + bc + ac) * (ab + bc - ac) * (ab - bc + ac) * (-ab + bc + ac));
                Double r = (ab * bc * ac) / x ;
                Double res = Math.PI * r * r ;
                System.out.println(String.format("%.3f", res));
            }
            else{
                System.out.println("INVALID");
            }
        }


    }
    
}

//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0