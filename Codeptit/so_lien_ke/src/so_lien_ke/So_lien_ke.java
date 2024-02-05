/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_lien_ke;

import java.util.Scanner ; 

public class So_lien_ke {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ; 
        String e = scanner.nextLine() ;
        while(tests-- > 0){
            String inp = scanner.nextLine() ;
            boolean res = true;
            for(int i = 0 ; i < inp.length() - 1 ; i++){
                if(Math.abs((int)inp.charAt(i) - (int)inp.charAt(i + 1)) != 1){
                    res = false ;
                    break ;
                }
            }
            if(res) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
