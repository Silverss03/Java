package sap_xep_ma_tran;

import java.io.* ;
import java.util.* ;
/**
 *
 * @author Admin
 */
public class Sap_xep_ma_tran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File obj = new File("MATRIX.in") ;
            Scanner scanner = new Scanner(obj) ; 
            int tests = Integer.parseInt(scanner.nextLine()) ; 
            while(tests-- > 0){
                int n = scanner.nextInt() ;
                int m = scanner.nextInt() ;
                int col = scanner.nextInt() ;
                List<Integer> ls = new ArrayList<>() ; 
                int[][] matrix = new int[n][m] ; 
                for(int i = 0 ; i < n ; i++){
                    for(int j = 0 ; j < m ; j++){
                        matrix[i][j] = scanner.nextInt() ;
                        if(j == col - 1){
                            ls.add(matrix[i][j]) ;
                        }
                    }
                }
                Collections.sort(ls);
                for(int i = 0 ; i < n ; i++){
                    for(int j = 0 ; j < m ; j++){
                        if(j != col - 1){
                            System.out.print(matrix[i][j] + " ");
                        }
                        else{
                            System.out.print(ls.get(i)+ " ");
                        }
                    }
                    System.out.println("");
                }
            }
        }
        catch(FileNotFoundException e){
            
        }   
    }
    
}
