/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dien_thoai_cuc_gach;

import java.util.Scanner ;
public class Dien_thoai_cuc_gach {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String tmp = scanner.nextLine() ;
            tmp = tmp.toLowerCase() ;
            String num = "" ;
            for(int i = 0 ; i < tmp.length() ; i++){
                switch (tmp.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    num += "2";
                    break ;
                case 'd':
                case 'e':
                case 'f':
                    num += "3";
                    break ;
                case 'g':
                case 'h':
                case 'i':
                    num += "4";
                    break ;
                case 'j':
                case 'k':
                case 'l':
                    num += "5";
                    break ;
                case 'm':
                case 'n':
                case 'o':
                    num += "6";
                    break ;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    num += "7";
                    break ;
                case 't':
                case 'u':
                case 'v':
                    num += "8";
                    break ;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    num += "9";
                    break ;
                }
            }
            if(num.equals(new StringBuilder(num).reverse().toString())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
