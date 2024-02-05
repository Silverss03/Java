package hop_cua_2_day_so;

import java.util.Scanner ;
import java.util.Arrays ;
public class Hop_cua_2_day_so {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int size = 0 ; 
        int n = scanner.nextInt() ;
        int m = scanner.nextInt() ;
        int[] count = new int[1002] ;
        int[] res = new int[202] ;
        for(int i = 0 ; i < (m + n) ; i++){
            int tmp = scanner.nextInt() ;
            count[tmp]++ ; 
            if(count[tmp] == 1){
                res[size++] = tmp ;
            }
        }
        Arrays.sort(res) ;
        for(int i : res){
            if(i != 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
