
package hinh_vuong;

import java.util.Scanner ;
public class Hinh_vuong {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int x1 = scanner.nextInt() ;
        int y1 = scanner.nextInt() ;
        int x2 = scanner.nextInt() ;
        int y2 = scanner.nextInt() ;
        int x3 = scanner.nextInt() ;
        int y3 = scanner.nextInt() ;
        int x4 = scanner.nextInt() ;
        int y4 = scanner.nextInt() ; 
        int len = Math.max(Math.max(x1,x2),Math.max(x3, x4)) - Math.min(Math.min(x1,x2),Math.min(x3, x4)) ;
        int width = Math.max(Math.max(y1,y2),Math.max(y3, y4)) - Math.min(Math.min(y1,y2),Math.min(y3, y4)) ;
        System.out.println(Math.max(len, width) * Math.max(len, width));
    }
    
}
