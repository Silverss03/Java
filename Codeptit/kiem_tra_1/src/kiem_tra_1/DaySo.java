package kiem_tra_1;

import java.util.* ; 
public class DaySo {
    private int[] a ; 

    public DaySo() {
        System.out.println("Nhap vao mot day so:");
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+") ;
        a = new int[arr.length] ;
        for(int i = 0 ; i < arr.length ; i++){
            a[i] = Integer.parseInt(arr[i]) ;

        }
        System.out.println("");
    }
    
    public void minMax(){
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > max){
                max = a[i] ;
            }
            if(a[i] < min){
                min = a[i] ;
            }
        } 
        System.out.println("So lon nhat:");
        System.out.println(max);
        System.out.println("So nho nhat:");
        System.out.println(min);
    }
    
    public void kieuDay(){
        boolean inc =true, dec = true ;
        for(int i = 0 ; i < a.length - 1 ; i++){
            if(a[i] < a[i + 1] ){
                dec = false ;
            }
            else if(a[i] > a[i + 1] ){
                inc = false ;
            }
        }
        if(inc){
            System.out.println("Day tang dan");
        }
        else if(dec){
            System.out.println("Day giam dan");
        }
        else{
            System.out.println("Day lon xon");
        }
    }
    
    
}
