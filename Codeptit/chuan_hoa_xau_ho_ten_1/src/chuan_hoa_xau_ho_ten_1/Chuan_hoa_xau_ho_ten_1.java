
package chuan_hoa_xau_ho_ten_1;

import java.util.Scanner ;
public class Chuan_hoa_xau_ho_ten_1 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static String normalize(String a){
        if(a.length() == 1){
            return a.toUpperCase() ;
        }
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() ;
    }
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String inp = scanner.nextLine().trim() ;
            String[] arr = inp.split("\\s+" ) ;
            for(int i = 0 ; i < arr.length ; i++){
                System.out.print(normalize(arr[i] ) + " ");
            }
            System.out.println("");
        }
    }
    
}
