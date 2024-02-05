
package giaiphuongtrinhbacnhat;

import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int a = scanner.nextInt() ;
        int b = 0 ;
        boolean neg = false ;
        String c = scanner.nextLine() ;
        for(int i = 0 ; i < c.length() ; i++){
            if(c.charAt(i) == '-'){
                neg = true ;
            }
            if(c.charAt(i) >= '0' && c.charAt(i) <= '9'){
                b = b * 10 + (int)(c.charAt(i) - '0') ;
            }
        }
        if(neg) b *= -1 ;
        if(a == 0 && b != 0){
            System.out.println("VN") ;
        }   
        else if(a == 0 && b == 0){
            System.out.println("VSN") ;
        }
        else{
            double res = (double)-b/a ;
            System.out.printf("%.2f",res) ;
        }
    }
    
}
