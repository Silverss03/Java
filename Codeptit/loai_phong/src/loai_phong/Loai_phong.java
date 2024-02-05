package loai_phong;

import java.io.* ;
import java.util.* ;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String type, name ;
    private int price ;
    private double service ;
    public LoaiPhong(String inp){
        String[] arr = inp.split("\\s+") ;
        type = arr[0] ;
        name = arr[1] ;
        price = Integer.parseInt(arr[2]) ;
        service = Double.parseDouble(arr[3]) ;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.getName()) ;
    }
    
    @Override
    public String toString(){
        return type + " " + name + " " + price + " " + String.format("%.2f", service) ;
    }
}
public class Loai_phong {

    public static void main(String[] args) throws IOException {
            ArrayList<LoaiPhong> ds = new ArrayList<>();
            Scanner in = new Scanner(new File("PHONG.in"));
            int n = Integer.parseInt(in.nextLine());
            while(n-->0){
                ds.add(new LoaiPhong(in.nextLine()));
            }
            Collections.sort(ds);
            for(LoaiPhong tmp : ds){
                System.out.println(tmp);
            }
        }
    
}
