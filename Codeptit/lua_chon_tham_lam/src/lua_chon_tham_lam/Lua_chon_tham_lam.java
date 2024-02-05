package lua_chon_tham_lam;

import java.util.* ; 

public class Lua_chon_tham_lam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n, s ;
        n = scanner.nextInt() ;
        s = scanner.nextInt() ;
        int s2 = s ;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n] ; 
        if(s <= 0 || s > n*9){
            System.out.println("-1 -1");
        }
        else{
            for(int i = 0 ; i < n ; i++){
                arr1[i] = 0 ;
                arr1[i] += Math.min(s, 9) ;
                s -= Math.min(s, 9) ;
            }
            arr2[0] = 1 ;
            s2-- ;
            for(int i = n - 1 ; i >= 0 ; i--){
                if(i != 0) arr2[i] = 0 ; 
                arr2[i] += Math.min(s2, 9) ;
                s2 -= Math.min(s2, 9) ;
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr2[i]);
            }
            System.out.print(" ");
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr1[i]);
            }
        }
    }
    
}
