package day_uu_the;

import java.util.* ; 

public class Day_uu_the {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.valueOf(scanner.nextLine() );
        while(tests-- > 0){
            String[] inp = scanner.nextLine().split("\\s+") ;
            int odd = 0 , even = 0 ; 
            for(int i = 0 ; i < inp.length ; i++){
                int tmp = Integer.valueOf(inp[i]) ;
                if(tmp % 2 == 0){
                    even++ ;
                }
                else{
                    odd++ ; 
                }
            }
            if((even > odd && inp.length % 2 == 0) || (odd > even && inp.length % 2 == 1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

//2
//11 22 33 44 55 66 77
//23 34 45 56 67 78 89 90 121 131 141 151 161 171