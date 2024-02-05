package dem_so_lan_xuat_hien;

import java.util.* ;
public class Dem_so_lan_xuat_hien {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        int t = 1 ;
        while(tests-- > 0){
            int n = scanner.nextInt() ;
            int[] arr = new int[n] ;
            int[] count = new int[100002] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
                count[arr[i]]++ ;
            }
            System.out.println("Test " + t + ":");
            for(int i = 0 ; i < n ; i++){
                if(count[arr[i]] >= 1){
                    System.out.println(arr[i] + " xuat hien " + count[arr[i]] + " lan");
                    count[arr[i]] = 0 ;
                }
            }
            t++ ;
        }
    }
    
}
