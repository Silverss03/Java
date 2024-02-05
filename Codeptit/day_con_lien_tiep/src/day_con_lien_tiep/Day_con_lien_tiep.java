package day_con_lien_tiep;

import java.util.* ;
public class Day_con_lien_tiep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int tests = Integer.parseInt(scanner.nextLine()) ; 
        while(tests-- > 0){
            int n = Integer.parseInt(scanner.nextLine()) ;
            int[] arr = new int[n + 1] ; 
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;     
            }
            if(tests != 0){
                scanner.nextLine() ;
            }
            long s = -999999999; 
            long e = -999999999;
            for(int i = 0 ; i < n ; i++){
                e = Math.max(arr[i], e + arr[i]) ;
                s = Math.max(s, e) ;
            }
            System.out.println(s);
        }
    }
    
}
