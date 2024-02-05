/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_uu_the;

import java.util.Scanner ;

public class So_uu_the {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String inp = scanner.nextLine() ;
            int even = 0 ;
            int odd = 0 ;
            boolean valid = true ;
            for(int i = 0 ; i < inp.length() ; i++){
                if(inp.charAt(i) < '0' || inp.charAt(i) > '9'){
                    valid = false ;
                    break ;
                }
                else if((int)(inp.charAt(i) - '0') % 2 == 0){
                    even++ ;
                }
                else{
                    odd++ ;
                }
            }
            if(valid){
                if((even > odd && inp.length() % 2 == 0) || (odd > even && inp.length() % 2 != 0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("INVALID");
            }

        }
    }
    
}
