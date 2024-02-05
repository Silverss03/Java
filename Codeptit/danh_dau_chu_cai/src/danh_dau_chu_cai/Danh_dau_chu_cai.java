
package danh_dau_chu_cai;

import java.util.* ;
public class Danh_dau_chu_cai {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String tmp = scanner.nextLine() ;
        int res = 0 ; 
        Map<Character, Integer> mp = new HashMap<Character, Integer>() ;
        for(int i = 0 ; i < tmp.length() ; i++){
            int curr = mp.getOrDefault(tmp.charAt(i), 0) ;
            if(curr == 0){
                res += 1 ;
            }
            mp.put(tmp.charAt(i), curr + 1) ;
        }
        System.out.println(res);
    }
    
}
