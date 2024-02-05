package point_class;

import java.util.Scanner ;
public class Point_class {

    public static Scanner scanner = new Scanner(System.in) ;
    public static class Point{
        private double x,y ;

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
        
        public double distance(Point second){
            double a = this.x - second.getX() ;
            double b = this.y - second.getY() ;
            return Math.sqrt(Math.abs(a*a + b * b)) ;
        }
        
        public double distance(Point p1, Point p2){
            double a = Math.abs(p1.getX() - p2.getX()) ;
            double b = Math.abs(p1.getY() - p2.getY()) ;
            return Math.sqrt(Math.abs(a*a + b * b)) ;
        }
        
        @Override
        public String toString(){
            return x + " " + y ;
        }
    }
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble()) ;
            System.out.printf("%.4f",p1.distance( p2));
            System.out.println("");
        }
    }
    
}
