package tich_ma_tran_voi_chuyen_vi_cua_no;

import java.util.Scanner ;
public class Tich_ma_tran_voi_chuyen_vi_cua_no {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        for(int t = 1 ; t <= tests ; t++){
            int n = scanner.nextInt() ;
            int m = scanner.nextInt() ;
            int[][] arr = new int[n][m] ;
            int[][] n_arr = new int[m][n] ;
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    arr[i][j] = scanner.nextInt() ;
                    n_arr[j][i] = arr[i][j] ;
                }
            }
            System.out.println("Test " + t + ":");
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    int tmp = 0 ;
                    for(int k = 0 ; k < m ; k++){
                        tmp += arr[i][k] * n_arr[k][j] ;
                    }
                    System.out.print(tmp + " ");
                }
                System.out.println("");
            }
         }
    }
    
}
