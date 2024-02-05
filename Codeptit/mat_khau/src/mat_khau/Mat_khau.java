package mat_khau;

import java.util.* ; 

public class Mat_khau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        String s = scanner.nextLine() ; 
        String start = scanner.next() ;
        int diff = start.codePointAt(0) - 97;
        int code = (scanner.nextInt() - diff + 26) % 26 ;
        Map<Character, Integer> mp = new HashMap<>() ; 
        for(int i = 0 ; i < 26 ; i++){
            mp.put((char) (97 + i), (code++)%26) ;
        }
        int res = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                res += mp.get(s.charAt(i)) ;
            }  
        }
        System.out.println(res);
    }
    
}
