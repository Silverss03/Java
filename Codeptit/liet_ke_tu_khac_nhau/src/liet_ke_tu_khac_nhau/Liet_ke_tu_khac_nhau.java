package liet_ke_tu_khac_nhau;

import java.io.* ;
import java.util.* ;
class WordSet{
    private File obj  ;
    private List<String> string_l ;
    public WordSet(String file) {
        try{
            File obj = new File(file) ;
            Scanner scanner = new Scanner(obj) ;
            HashSet<String> st = new HashSet<>() ;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine() ;
                String[] arr = line.split("\\s+" ) ;
                for(String i : arr){
                    st.add(i.toLowerCase()) ;
                }
            }
            string_l = new ArrayList<String>(st) ;
        }
        catch(FileNotFoundException e){
            
        }
    }
    @Override
    public String toString(){
        String s = "" ;
        Collections.sort(string_l);
        for(String i : string_l){
            s = s + i + "\n" ;
        }
        return s ;
    }
}

public class Liet_ke_tu_khac_nhau {

public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    
}
