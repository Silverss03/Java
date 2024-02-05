
package chuan_hoa_xau_ho_ten_2;

import java.util.Scanner ;
public class Chuan_hoa_xau_ho_ten_2 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static String normalize(String a){
        if(a.length() == 1){
            return a.toUpperCase() ;
        }
        return a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase() ;
    }
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String input = scanner.nextLine().trim() ;
            String arr[] = input.split("\\s+") ;
            for(int i = 1 ; i < arr.length; i++){
                if(i != arr.length - 1) System.out.print(normalize(arr[i]) + " ");
                else System.out.print(normalize(arr[i]) );
            }
            System.out.println(", " + arr[0].toUpperCase());
        }
    }
    
}
