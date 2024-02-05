
package chuan_hoa_va_sap_xep;

import java.io.* ;
import java.util.* ;

public class Chuan_hoa_va_sap_xep {

    public static void main(String[] args) {
        try{
            File obj = new File("DANHSACH.in") ;
            Scanner scanner = new Scanner(obj) ; 
            List<String> ls = new ArrayList<>() ; 
            while(scanner.hasNextLine()){
                String line = scanner.nextLine() ; 
                ls.add(line) ;
            }
            for(int i = 0 ; i < ls.size() ; i++){
                String[] arr = ls.get(i).toLowerCase().trim().split("\\s+") ; 
                for(int j = 0 ; j < arr.length ; j++){
                    arr[j] = arr[j].substring(0,1).toUpperCase() + arr[j].substring(1) ;
                }
                ls.set(i, String.join(" ", arr)) ;
            }
            ls.sort(new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    String ten1 = o1.substring(o1.lastIndexOf(" ")) ;
                    String ten2 = o2.substring(o2.lastIndexOf(" ")) ;
                    String ho1 = o1.substring(0, o1.lastIndexOf(" ")) ;
                    String ho2 = o2.substring(0, o2.lastIndexOf(" ")) ;
                    if(ten1.equalsIgnoreCase(ten2)){
                        return ho1.compareToIgnoreCase(ho2) ;
                    }
                    return ten1.compareToIgnoreCase(ten2) ;
                }
            });
            for(String x : ls){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
