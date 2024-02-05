
package kt1;

import java.util.* ; 
public class MaTran {
    private int[][] arr ;

    public MaTran() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhap vao kich thuoc ma tran:");
        int n = scanner.nextInt() ; 
        arr = new int[n][n] ;
        System.out.println("Nhap ma tran:");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scanner.nextInt() ;
            }
        }
    }
    
    private int getSize(){
        return arr[0].length ; 
    }
    
    public void tongHang(){
        int n = getSize() ; 
        for(int i = 0 ; i < n ; i ++){
            long sum = 0 ; 
            for(int j = 0 ; j < n ; j ++){
                sum += arr[i][j] ;
            }
            System.out.println("Tong hang " + i + " la:");
            System.out.println(sum);
        }
    }
}
