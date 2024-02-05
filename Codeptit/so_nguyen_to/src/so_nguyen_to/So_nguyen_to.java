/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_nguyen_to;

import java.util.Scanner ;
import java.lang.Math ;

public class So_nguyen_to {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tests ;
        Scanner scanner = new Scanner(System.in) ;
        tests = scanner.nextInt() ;
        while(tests-- > 0){
            int num = scanner.nextInt() ;
            if(num % 2 == 0){
                System.out.println("NO") ;
            }
            else{
                boolean res = false; 
                for(int i = 3 ; i <= Math.sqrt(num) ; i += 2){
                    if(num % i == 0){
                        res = true ;
                        break ;
                    }
                }
                if(res){
                    System.out.println("NO") ;
                }
                else{
                    System.out.println("YES") ;
                }
            }
        }
    }
    
}
