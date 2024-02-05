package liet_ke_theo_thu_tu_xuat_hien;

import java.io.* ; 
import java.util.* ; 

public class Liet_ke_theo_thu_tu_xuat_hien {

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in")) ;
        List<String> ls = (ArrayList<String>) ois.readObject() ;
        Set<String> res = new TreeSet<>() ; 
        for(String x : ls){
            String[] arr = x.trim().toLowerCase().split("\\s+") ;
            for(String y :arr){
                res.add(y) ;
            }
        }
        File obj = new File("VANBAN.in") ;
        Scanner scanner = new Scanner(obj) ;
        while(scanner.hasNext()){
            String tmp = scanner.next().toLowerCase() ;
            if(res.contains(tmp)){
                System.out.println(tmp);
                res.remove(tmp) ;
            }
        }

    }
    
}
