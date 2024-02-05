package danh_sach_doanh_nghiep;

import java.io.* ; 
import java.util.* ; 

class Enterprise implements Comparable<Enterprise>{

    private String id, name ;
    private int s_num ;

    public Enterprise(String id, String name, int s_num) {
        this.id = id;
        this.name = name;
        this.s_num = s_num;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + s_num ; 
    }
    
    @Override
    public int compareTo(Enterprise o){
        return id.compareTo(o.getId()) ;
    }
    
}
public class Danh_sach_doanh_nghiep {

    
    public static void main(String[] args) throws FileNotFoundException{
        File obj = new File("DN.in") ;
        Scanner scanner = new Scanner(obj) ;
        int e_num = Integer.parseInt(scanner.nextLine()) ;
        Enterprise[] ls = new Enterprise[e_num] ; 
        for(int i = 0 ; i < e_num ; i++){
            String id = scanner.nextLine() ; 
            String name = scanner.nextLine() ; 
            int num = Integer.parseInt(scanner.nextLine()) ;
            ls[i] = new Enterprise(id,name,num) ; 
        }
        Arrays.sort(ls) ; 
        for(Enterprise x : ls){
            System.out.println(x);
        }
    }
    
}
