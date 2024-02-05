
package dia_chi_email;

import java.util.* ;
public class Dia_chi_email {

    public static Scanner scanner = new Scanner(System.in) ;
    public static char change(String a){
        String b = a.toLowerCase() ;
        return b.charAt(0) ;
    }
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<String, Integer>() ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String input = scanner.nextLine().trim() ;
            String arr[] = input.split("\\s+") ;
            String res = "" ;
            res += arr[arr.length - 1].toLowerCase();
            for(int i = 0 ; i < arr.length - 1; i++){
                res += change(arr[i]) ;                       
            }          
            int curr = mp.getOrDefault(res, 0) ;
            mp.put(res, curr + 1) ;
            if(curr >= 1){
                res += String.valueOf(curr + 1) ;
            }
            res += "@ptit.edu.vn" ;
            System.out.println(res);
        }         
    }
    
}
