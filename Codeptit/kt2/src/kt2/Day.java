package kt2;

import java.util.* ; 
public class Day {
    private int[] arr ; 

    public Day() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhap vao kich thuoc day");
        Integer n = Integer.valueOf(scanner.nextLine()) ;
        System.out.println("Nhap day");
        arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt() ; 
        }
    }
    
    public void tong(){
        long sum = 0 ; 
        System.out.println("Tong cua day");
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i] ; 
        }
        System.out.println(sum);
    }
    
    public void sapXep(){
        Arrays.sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    
    
}
