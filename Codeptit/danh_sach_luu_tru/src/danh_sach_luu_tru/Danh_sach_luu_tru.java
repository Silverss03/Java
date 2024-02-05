package danh_sach_luu_tru;

import java.util.* ;
import java.io.* ;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class Customer implements Comparable<Customer>{
    private String id_cus, name, id_room ;
    private static int id_cus_n = 1 ;
    private Long days ;

    public Customer( String name, String id_room, long days) {
        this.days = days;
        this.name = name;
        this.id_room = id_room;
    }

    public long getDays() {
        return days;
    }

    
    public String getId_cus() {
        return id_cus;
    }

    
    public void setId_cus() {
        this.id_cus = "KH" + String.format("%02d", id_cus_n++) ;
    }

    @Override
    public int compareTo(Customer o) {
        return -days.compareTo(o.getDays()) ;
    }
    
    @Override
    public String toString(){
        return id_cus + " " + name + " " + id_room + " " +days ;
    }
}
public class Danh_sach_luu_tru {

    public static void main(String[] args)throws FileNotFoundException, ParseException {
        File obj = new File("KHACH.in") ;
        Scanner scanner = new Scanner(obj) ;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Customer> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ;
            String id_room = scanner.nextLine() ; 
            Date begin = sdf.parse(scanner.nextLine()) ;
            Date end = sdf.parse(scanner.nextLine()) ;
            Long duration = (end.getTime() - begin.getTime()) / (1000L * 60 * 60 * 24); 
            Customer tmp = new Customer(name, id_room, duration) ;
            tmp.setId_cus();
            ls.add(tmp) ; 
        }
        Collections.sort(ls);
        for(Customer x : ls){
            System.out.println(x);
        }
    }
    
}
