package hinh_sao;

import java.util.* ;
public class Hinh_sao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int[] cnt = new int[100002] ;
        int cen = 0 ;
        int out = 0 ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n - 1; i++){
            int x = scanner.nextInt() ;
            int y = scanner.nextInt() ;
            cnt[x]++ ; 
            cnt[y]++ ;
        }
        for(int i = 1 ; i <= n ; i++){
            if(cnt[i] == n - 1){
                cen++ ;
            }
            else if(cnt[i] == 1){
                out++ ;
            }
        }
        if(cen == 1 && out == n - 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
