
package dao_tu;

import java.util.* ;
public class Dao_tu {

    public static Scanner scanner = new Scanner(System.in) ;
    public static String rev(String a){
        String res = "" ;
        for(int i = a.length() - 1 ; i >= 0 ; i--){
            res += a.charAt(i) ;
        }
        return res ;
    }
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String tmp = scanner.nextLine() ;
            String[] arr = tmp.split("\\s+")  ;
            for(int i = 0 ; i < arr.length ; i++){
                System.out.print(rev(arr[i]) + " ");
            }
            System.out.println("");
        }
    }
    
}
