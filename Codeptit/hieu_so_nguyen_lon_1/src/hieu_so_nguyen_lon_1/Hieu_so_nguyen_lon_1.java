package hieu_so_nguyen_lon_1;

import java.util.* ; 

public class Hieu_so_nguyen_lon_1 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static boolean cmp(String a, String b){
        if(a.length() < b.length()){
            return false ;
        }
        if(a.length() > b.length()){
            return true ;
        }
        for(int i = 0 ; i < a.length() ; i++){
            if(a.charAt(i) < b.charAt(i)){
                return false ;
            }
            else if(a.charAt(i) > b.charAt(i)){
                return true ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String s1 = scanner.next() ;
            String s2 = scanner.next() ; 
            String res = "" ;
            if(cmp(s1,s2) == false){
                String tmp = s1 ;
                s1 = s2 ; 
                s2 = tmp ;
            }
            int n1 = s1.length() ;
            int n2 = s2.length() ;
            int exceed = 0 ;
            s1 = new StringBuilder(s1).reverse().toString() ;
            s2 = new StringBuilder(s2).reverse().toString() ;
            for(int i = 0 ; i < n2 ; i++){
                int sub = (int)(s1.charAt(i) - '0') - (int)(s2.charAt(i) - '0') - exceed ;
                if(sub < 0){
                    sub += 10 ;
                    exceed = 1;
                }
                else{
                    exceed = 0 ;
                }
                res += (char)(sub + '0') ;
            }
            for(int i = n2 ; i < n1 ; i++){
                int sub = (int)(s1.charAt(i) - '0') - exceed ;
                if(sub < 0){
                    sub += 10 ;
                    exceed = 1 ;
                }
                else{
                    exceed = 0 ;
                }
                res += (char)(sub + '0') ;
            }
            res = new StringBuilder(res).reverse().toString() ;
            System.out.println(res);
        }
    }
    
}