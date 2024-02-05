package ma_hoa_drm;

import java.util.* ;

public class Ma_hoa_drm {

    public static int count(StringBuilder s){
        int res = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            res += Integer.valueOf(s.charAt(i) - 'A') ;
        }
        return res ; 
    }
    
    public static char rotate(char x, int r){
        int n = Integer.valueOf(x) + (r % 26) ; 
        if(n > 90){
            n -= 26 ; 
        }
        return (char)n ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.valueOf(scanner.nextLine()) ;
        while(tests-- > 0){
            String inp = scanner.nextLine() ;
            StringBuilder f_half = new StringBuilder(inp.substring(0, inp.length()/2)) ;
            StringBuilder s_half = new StringBuilder(inp.substring(inp.length()/2)) ;
            int f_n = count(f_half) ;
            int s_n = count(s_half) ;
            for(int i = 0 ; i < f_half.length() ; i++){
                f_half.setCharAt(i, rotate(f_half.charAt(i), f_n));
            }
            for(int i = 0 ; i < s_half.length() ; i++){
                s_half.setCharAt(i, rotate(s_half.charAt(i), s_n)) ;
            }
            for(int i = 0 ; i < f_half.length() ; i++){
                f_half.setCharAt(i, rotate(f_half.charAt(i), (int)(s_half.charAt(i) - 'A')));
            }
            System.out.println(f_half);
        }
    }
    
}
