package kt2;

import java.util.* ;
public class MaTran {
    private int[][] m ; 

    public MaTran() {
        System.out.println("Nhap kich thuoc ma tran:");
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ; 
        m = new int[n][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                m[i][j] = scanner.nextInt() ; 
            }
        }
    }
    
    public int getLen(){
        return m.length ;
    }
    
    public int numAt(int i, int j){
        return m[i][j] ; 
    }
    public void tong(MaTran b){
        if(m.length != b.getLen()){
            System.out.println("Hai ma tran phai co cung kich thuoc!");
        }
        else{
            for(int i = 0 ; i < m.length ; i++){
                for(int j = 0 ; j < m[0].length ; j++){
                    int tmp = m[i][j] + b.numAt(i, j) ;
                    System.out.print(tmp + " ");
                }
                System.out.println("");
            }
        }
    }
    
}
