package so_khac_nhau_trong_file_3;

import java.util.* ;
import java.io.* ;
public class So_khac_nhau_trong_file_3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream("DATA.in") ;
        ObjectInputStream ois = new ObjectInputStream(fos) ;
        ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject() ;
        int[] cnt = new int[1000] ; 
        for(Integer x : arr){
            cnt[x]++ ; 
        }
        for(int i = 0 ; i < 1000 ; i++){
            System.out.println(i + " " + cnt[i]);
        }
    }
    
}
