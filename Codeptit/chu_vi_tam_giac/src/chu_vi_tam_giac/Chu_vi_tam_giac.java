package chu_vi_tam_giac;

import java.util.Scanner ;
class Point{
    private double x,y ;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        x = p.getX() ;
        y = p.getY() ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        double a = Math.abs( x - secondPoint.getX()) ;
        double b = Math.abs(y - secondPoint.getY()) ;
        return Math.sqrt(a*a +b * b) ;
    }
    
    public double distance(Point p1, Point p2){
        double a = Math.abs(p1.getX() - p2.getX()) ;
        double b = Math.abs(p1.getY() - p2.getY()) ;
        return Math.sqrt(a*a +b * b) ;
    }
    
    public String toString(){
        return "Chu vi tam giac" ;
    }
    
}
public class Chu_vi_tam_giac {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            Point a = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            Point b = new Point(scanner.nextDouble(), scanner.nextDouble()) ; 
            Point c = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            if(a.distance(b) + b.distance(c) > a.distance(c) && a.distance(c) + b.distance(c) > a.distance(b) && a.distance(b) + a.distance(c) > b.distance(c)){
                System.out.printf("%.3f", a.distance(b) + b.distance(c) + a.distance(c));
                System.out.println("");
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
    
}
