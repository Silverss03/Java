package so_dung_dau;

import java.util.* ; 


public class So_dung_dau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            Stack<Integer> st = new Stack<>() ; 
            int n = Integer.parseInt(scanner.nextLine()) ;
            int[] arr = new int[n + 1] ; 
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            if(tests != 0){
                scanner.nextLine() ;
            }
            st.add(arr[n - 1]) ;
            for(int i = n - 2 ; i >= 0 ; i--){
                if(arr[i] >= st.peek()){
                    st.add(arr[i]) ;
                }
            }
            while(st.size() > 0){
                System.out.print(st.pop() + " ");
            }
        }
    }
    
}
