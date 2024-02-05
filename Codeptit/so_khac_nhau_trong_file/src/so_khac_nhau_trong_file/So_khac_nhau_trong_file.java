package so_khac_nhau_trong_file;

import java.util.* ;
import java.io.* ;
import java.util.* ;
public class So_khac_nhau_trong_file {

    public static void main(String[] args) throws IOException {
        int[] cnt = new int[1000] ; 
        File obj = new File("DATA.IN") ;
        FileInputStream file_in = new FileInputStream(obj); 
        DataInputStream dis = new DataInputStream(file_in) ;
        ArrayList<Integer> arr = new ArrayList<>() ; 
        while(true) {
            try {
                int a = dis.readInt();
                arr.add(a) ;
                cnt[a]++ ;
            }
            catch(EOFException eof) {
                break;
            }
        }
        Collections.sort(arr);
        for(Integer x : arr){
            if(cnt[x] > 0){
                System.out.println(x + " " + cnt[x]);
                cnt[x] = 0 ;
            }
                
        }
    }
    
}
