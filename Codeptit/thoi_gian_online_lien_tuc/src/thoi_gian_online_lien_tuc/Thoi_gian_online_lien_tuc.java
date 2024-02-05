package thoi_gian_online_lien_tuc;

/**
 *
 * @author Admin
 */
import java.io.* ; 
import java.util.* ; 

class Onl{
    private String name ;
    private long dur, sec ;

    public Onl(String name, long dur, long sec) {
        this.name = name;
        this.dur = dur ;
        this.sec = sec ;
    }

    public long getDur() {
        return dur;
    }

    public String getName() {
        return name;
    }

    public long getSec() {
        return sec;
    }
    
    @Override
    public String toString(){
        return name + " " + dur ; 
    }
}
public class Thoi_gian_online_lien_tuc {

    public static void main(String[] args) {
        try{
            File obj = new File("ONLINE.in") ;
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            List<Onl> ls = new ArrayList<>() ;
            for(int i = 0 ; i < n ; i++){
                String name = scanner.nextLine() ;
                String start = scanner.nextLine() ; 
                String end = scanner.nextLine() ; 
                Long day_s = Long.valueOf(start.substring(0, 2)) ;
                Long day_e = Long.valueOf(end.substring(0, 2)) ;
                Long month_s = Long.valueOf(start.substring(3, 5)) ;
                Long month_e = Long.valueOf(end.substring(3, 5)) ;
                Long year_s = Long.valueOf(start.substring(6, 10)) ;
                Long year_e = Long.valueOf(end.substring(6, 10)) ;
                Long dur = (year_e - year_s) * 525600 +(month_e - month_s) * 43200 + (day_e - day_s) * 1440;
                dur = dur + (Long.parseLong(end.substring(11, 13)) * 60 +Long.parseLong(end.substring(14, 16)) )- (Long.parseLong(start.substring(11, 13)) * 60 + Long.parseLong(start.substring(14,16))) ;
                Long sec = (Long.valueOf(end.substring(17)) - Long.valueOf(start.substring(17))) ;
                ls.add(new Onl(name, dur, sec)) ;
            }
            ls.sort(new Comparator<Onl>(){
                @Override
                public int compare(Onl o1, Onl o2) {
                    if(o1.getDur() == o2.getDur()){
                        if(o1.getSec() == o2.getSec()){
                            return o1.getName().compareTo(o2.getName()) ;
                        }
                        return Long.compare(o2.getSec(), o1.getSec()) ;
                    }
                    return Long.compare(o2.getDur(), o1.getDur()) ;
                }
            });
            for(Onl x : ls){
                System.out.println(x);
            }
        }
        catch(Exception e){
            
        }
    }
    
}
