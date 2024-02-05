
package kt3;

import java.util.* ;
public class MaTran {
    private int[][] a ; 

    public MaTran() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhap kich thuoc hang cot:");
        int n = Integer.parseInt(scanner.nextLine()) ;
        a = new int[n][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                a[i][j] = scanner.nextInt() ;
            }
        }
    }
    
    public void max(){
        int h = 0 ,c = 0, dc = 0;
        int max_h = -1, max_c = 0, sum_dc = 0 ; 
        for(int i = 0 ; i < a.length ; i++){
            int sum_h = 0 ; 
            for(int j = 0 ; j < a[0].length ; j++){
                sum_h += a[i][j] ; 
                if(sum_h > max_h){
                    max_h = sum_h ;
                    h = i + 1;
                }
                if(i == j){
                    sum_dc += a[i][j] ;
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            int sum_c = 0 ; 
            for(int j = 0 ; j < a[0].length ; j++){
                sum_c += a[j][i] ; 
                if(sum_c > max_c){
                    max_c = sum_c ;
                    c = i + 1;
                }
            }
        }
        if(max_h > max_c && max_h > sum_dc){
            System.out.println("Hang " + h + " co tong max");
            System.out.println(max_h);
        }
        else if(max_c > max_h && max_c > sum_dc){
            System.out.println("Cot " + c + " co tong max");
            System.out.println(max_c);
        }
        else{
            System.out.println("Duong cheo chinh co tong max");
            System.out.println(sum_dc);
        }
    }
}
