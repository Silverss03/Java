package rut_gon_xau_ky_tu;

import java.util.Scanner ;
public class Rut_gon_xau_ky_tu {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String str = scanner.nextLine() ;      
        while(true){
            String new_str = "" ;
            int ok = 1 ;
            for(int i = 0 ; i < str.length() ; i++){
                if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                    i++ ;
                    ok = 0 ;
                }        
                else{
                    new_str += str.charAt(i) ;
                }
            }
            str = new_str ;
            if(ok == 1){
                break ;
            }            
        }
        if(str.equals("")){
            System.out.println("Empty String");
        }
        else{
            System.out.println(str);
        }
    }
    
}
