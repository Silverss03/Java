package kiem_tra_1;

import java.util.* ;
public class DaThuc {
    private int[] x ;
    private int n ; 

    public DaThuc() {
        System.out.println("Nhap vao bac n cua da thuc:");
        Scanner scanner = new Scanner(System.in) ; 
        n = Integer.parseInt(scanner.nextLine()) ; 
        x = new int[n] ;
        System.out.println("Nhap vao da thuc:");
        for(int i = 0 ; i < n ; i++){
            x[i] = scanner.nextInt() ;
        }
    }
    
    
}
