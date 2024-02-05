package ma_tran_xoan_oc_tang_dan;

import java.util.* ;

public class Ma_tran_xoan_oc_tang_dan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.valueOf(scanner.nextLine()) ; 
        List<Integer> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                ls.add(scanner.nextInt()) ;
            }
            scanner.nextLine() ;
        }
        Collections.sort(ls);
        boolean[][] seen = new boolean[n][n] ; 
        int[][] res = new int[n][n] ; 
        int[] dr = {0, 1, 0, -1} ;
        int[] dc = {1, 0, -1, 0} ;
        int x = 0, y = 0, di = 0 ; 
        for(Integer tmp : ls){
            res[x][y] = tmp ; 
            seen[x][y] = true ;
            int cr = x + dr[di] ;
            int cc = y + dc[di] ;
            if(cr >= 0 && cr < n && cc >= 0 && cc < n && !seen[cr][cc]){
                x = cr ;
                y = cc ;
            }
            else{
                di = (di + 1) % 4; 
                x += dr[di] ; 
                y += dc[di] ;
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

//3
//3 6 1
//8 7 9
//4 12 5
