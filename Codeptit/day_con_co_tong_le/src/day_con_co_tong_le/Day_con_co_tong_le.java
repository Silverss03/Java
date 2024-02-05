package day_con_co_tong_le;

import java.util.* ; 

public class Day_con_co_tong_le {

    public static void act(int[] arr, int n, int i, List<Integer> ls){
        for(int j = 0 ; j <= 1 ; j++){
            arr[i] = j ; 
            if(i != n - 1)
                act(arr, n, i + 1, ls) ;
            else{
                int sum = 0 ; 
                for(int k = 0 ; k < n ;k++){
                    //System.out.print(arr[k] + " ");
                    sum += ls.get(k) * arr[k];
                }
                //System.out.println("");
                if(sum % 2 == 1){
                    for(int k = 0 ; k < n ; k++){
                        if(arr[k] == 1){
                            System.out.print(ls.get(k) + " ");
                        }
                    }
                    System.out.println("");
                }
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = Integer.parseInt(scanner.nextLine()) ;
            List<Integer> ls = new ArrayList<>() ;
            for(int i = 0 ; i < n ; i++){
                ls.add(scanner.nextInt()) ;
            }
            scanner.nextLine() ;
            ls.sort(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Integer.compare(o2, o1) ; 
                }
            });
            int[] arr = new int[n] ;
            act(arr, n, 0, ls) ;
        }   
    }
}

//1
//4
//2 3 4 5
