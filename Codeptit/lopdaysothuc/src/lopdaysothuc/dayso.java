package lopdaysothuc;

import java.util.* ;
public class dayso {
    private double[] arr ;
    private double min , max ;
    
    public dayso(double[] arr) {
        this.arr = arr;
    }
    
    public dayso(){
        
    }

    public double[] getArr() {
        return arr;
    }
 
    public void setArr(double[] arr) {
        this.arr = arr;
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhap do dai cua day");
        int n = scanner.nextInt() ;
        this.arr = new double[n] ;
        for(int i = 0 ; i < n ; i++){
            this.arr[i] = scanner.nextDouble() ;
        }
    }
    
    public void out(){
        for(int i = 0 ; i < this.arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public void tong(){
        double sum = 0 ;
        for(int i = 0 ; i < this.arr.length ; i++){
            sum += this.arr[i] ;
        }
        System.out.println("Tong cua day so la: " + sum);
    }
    
    public void minmax(){
        this.min = Integer.MAX_VALUE ;
        this.max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < this.arr.length ; i++){
            if(this.arr[i] > max){
                this.max = this.arr[i] ;
            }
            if(this.arr[i] < min){
                this.min = this.arr[i] ;
            }
        }
        System.out.println("MIN: " + min + " " + "MAX: " + max);
    }
    
    public void pos_min_max(){
        int pos_min = -1, pos_max = -1;
        for(int i = 0 ; i < this.arr.length ; i++){
            if(pos_min != -1 && pos_max != -1){
                break ;
            }
            if(this.arr[i] == this.min && pos_min == -1){
                pos_min = i + 1;
            }
            if(this.arr[i] == this.max && pos_max == -1){
                pos_max = i + 1 ;
            }
        }
        System.out.println("Vi tri cua min: " + pos_min + " , vi tri cua max: " + pos_max);
    }
}
