package so_khac_nhau_trong_file_1;

import java.util.* ; 
import java.io.File ;
import java.io.FileNotFoundException ;

public class So_khac_nhau_trong_file_1 {

    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in") ;
            HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>() ; 
            Scanner scanner = new Scanner(obj) ; 
            while(scanner.hasNext()){
                int a = Integer.parseInt(scanner.next() ); 
                int curr = mp.getOrDefault(a, 0) ;
                mp.put(a, curr + 1) ;
            }
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                Integer key = entry.getKey() ;
                Integer value = entry.getValue() ;
                System.out.println(key + " " + value);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
