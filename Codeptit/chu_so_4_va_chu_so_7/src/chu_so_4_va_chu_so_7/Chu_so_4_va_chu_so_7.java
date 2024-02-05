/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chu_so_4_va_chu_so_7;

import java.util.Scanner ;

public class Chu_so_4_va_chu_so_7 {

    public static Scanner scanner = new Scanner(System.in) ;
    
    public static void main(String[] args) {
        String num = scanner.nextLine() ;
        int n4 = 0;
        int n7 = 0;
        for(int i = 0 ; i < num.length() ; i++){
            if(num.charAt(i) == '4'){
                n4++ ;
            }
            else if(num.charAt(i) == '7'){
                n7++ ;
            }
        }
        if((n4 + n7) == 4 || (n4 + n7) == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
