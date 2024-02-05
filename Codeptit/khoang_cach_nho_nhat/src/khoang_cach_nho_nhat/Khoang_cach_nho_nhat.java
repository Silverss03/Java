package khoang_cach_nho_nhat;

import java.util.* ; 

public class Khoang_cach_nho_nhat {

    static int uppper_bound(int l, int r, int[] a, int x){
        if(l>r) return l;
        int mid = (l+r)/2;
        if(a[mid] > x) return uppper_bound(l, mid - 1 , a, x);
        return uppper_bound(mid + 1, r, a, x);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n, k;
            long res = 0 ; 
            n = scanner.nextInt() ;
            k = scanner.nextInt() ;
            int[] arr = new int[n] ; 
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            Arrays.sort(arr);
            for(int i = 0 ; i < n ; i++){
                int y = uppper_bound(0, i-1, arr, arr[i]-k);
                res += (long)(i - y) ;
            }
            System.out.println(res);
        }
    }
    
}
//2
//4 3
//1 10 4 2
//3 5
//2 3 4
//1 2 4 10 