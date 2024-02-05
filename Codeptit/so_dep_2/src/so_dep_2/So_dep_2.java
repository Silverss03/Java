/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_dep_2;

import java.util.Scanner ;
public class So_dep_2 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
             String inp = scanner.nextLine() ;
             int n = inp.length() - 1 ;
             String rev = "" ;
             int sum = 0 ;
             if(inp.charAt(0) == '8' && inp.charAt(n) == '8'){
                for(int i = 0 ; i <= n ; i++){
                    rev = rev + inp.charAt(n - i) ;
                    sum += (int)(inp.charAt(i) -'0') ;
                }
                if(sum % 10 == 0 && rev.equals(inp)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
             }
             else{
                 System.out.println("NO");
             }
        }
    }
    
}
