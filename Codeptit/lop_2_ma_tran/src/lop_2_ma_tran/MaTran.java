package lop_2_ma_tran;

import java.util.Scanner ;
import java.util.Set;
public class MaTran {
    private int[][] a ;

    public MaTran(int[][] a) {
        this.a = a;
    }
    
    public MaTran(){}

    public MaTran(int n){
        a = new int[n][n] ;
    }
    public int[][] getMatrix() {
        return a;
    }
    
    public int getSize(){
        return a.length ;
    }
    
    public void setA(int[][] a) {
        this.a = a;
    }
    
    public void inp(int n){
        Scanner scanner = new Scanner(System.in) ;
        a = new int[n][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                this.a[i][j] = scanner.nextInt() ;
            }
        }
    }
    
    public void out(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public MaTran sum(MaTran b){
        MaTran res = new MaTran(this.a.length) ;
        int[][] tmp = new int[getSize()][getSize()] ;
        for(int i = 0 ; i < getSize() ; i++){
            for(int j = 0 ; j < getSize(); j++){
                tmp[i][j] = (a[i][j] + b.getMatrix()[i][j]) ;
            }
        }
        res.setA(tmp);       
        return res ;
    }
    
    public MaTran neg( MaTran b){
        MaTran res = new MaTran(getSize()) ;
        int[][] tmp = new int[getSize()][getSize()] ;
        for(int i = 0 ; i < getSize() ; i++){
            for(int j = 0 ; j < getSize(); j++){
                tmp[i][j] = (a[i][j] - b.getMatrix()[i][j]) ;
            }
        }
        res.setA(tmp);       
        return res ;     
    }
}
