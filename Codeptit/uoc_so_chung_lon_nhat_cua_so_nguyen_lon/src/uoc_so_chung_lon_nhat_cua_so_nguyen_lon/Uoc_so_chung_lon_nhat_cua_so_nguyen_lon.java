package uoc_so_chung_lon_nhat_cua_so_nguyen_lon;

import java.util.Scanner ; 
public class Uoc_so_chung_lon_nhat_cua_so_nguyen_lon {

    public static Scanner scanner = new Scanner(System.in) ;
    public static int GCD(int a, int b){
        if(b == 0) return a ;
        return GCD(b, a%b) ;
    }
    public static int reduce(int a, String b){
        int res = 0 ;
        for(int i = 0 ; i < b.length() ; i++){
            res = (res * 10 + b.charAt(i) - '0') % a ;
        }
        return res ;
    }
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int a = Integer.parseInt(scanner.nextLine()) ;
            String b = scanner.nextLine() ;
            int red = reduce(a,b) ;
            System.out.println(GCD(red, a));
         }
    }
    
}
