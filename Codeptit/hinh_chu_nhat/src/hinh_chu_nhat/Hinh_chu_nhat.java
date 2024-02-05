package hinh_chu_nhat;

import java.util.Scanner ;

public class Hinh_chu_nhat {

    public static void main(String[] args) {
        int x, y ;
        Scanner scanner = new Scanner(System.in) ;
        x = scanner.nextInt() ;
        y = scanner.nextInt() ;
        if(x > 0 && y > 0){
            System.out.print((x+y)*2 ) ;
            System.out.print(" ") ;
            System.out.print(x*y) ;
        }
        else{
            System.out.print(0);
        }
    }
    
}
