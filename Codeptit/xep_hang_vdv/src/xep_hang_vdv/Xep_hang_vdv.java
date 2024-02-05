package xep_hang_vdv;

import java.util.* ; 

class Athlete{
    private String id, name, real_result, prioritize, rank_result ;
    private int sec, ranking ; 
    private static int id_n = 1; 
    private static List<Integer> ls = new ArrayList<>() ; 

    public Athlete(String name, String b_day, String start, String fin) {
        this.id = "VDV" + String.format("%02d", id_n++) ;
        this.name = name;
        int age = 2021 - Integer.parseInt(b_day.substring(6 )) ;
        int prio_sec = 0 ;
        if(age >= 32){
            prio_sec = 3 ;
        }
        else if(age >= 25){
            prio_sec = 2 ; 
        }
        else if(age >= 18){
            prio_sec = 1 ;
        }
        this.prioritize = to_Time(prio_sec) ;
        String[] start_time = start.split(":") ;
        String[] end_time = fin.split(":") ;
        int real_sec = Integer.parseInt(end_time[0]) * 3600 + Integer.parseInt(end_time[1]) * 60 + Integer.parseInt(end_time[2]) 
                - Integer.parseInt(start_time[0]) * 3600 - Integer.parseInt(start_time[1]) * 60 - Integer.parseInt(start_time[2]);
        this.real_result = to_Time(real_sec) ;
        real_sec -= prio_sec ; 
        this.sec = real_sec ;
        ls.add(this.sec) ;
        this.rank_result = to_Time(real_sec) ;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReal_result() {
        return real_result;
    }

    public String getPrioritize() {
        return prioritize;
    }

    public String getRank_result() {
        return rank_result;
    }

    public int getSec() {
        return sec;
    }

    public static int getId_n() {
        return id_n;
    }

    public static List<Integer> getLs() {
        return ls;
    }

    public int getRanking() {
        return ranking;
    }

    
    public String to_Time(int sec){
        int h = sec / 3600 ; 
        int m = (sec %3600) /60 ;
        int s = (sec % 3600) % 60 ; 
        String res = String.format("%02d:%02d:%02d", h,m,s) ; 
        return res ;
    }

    public void addRank(){
        Collections.sort(ls);
        int r = 1 ; 
        for(int i = 0; i < ls.size() ; i++){    
            if(this.sec == ls.get(i)){
                this.ranking = r ; 
                break ;
            }
            r++ ; 
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + real_result + " " + prioritize + " " + rank_result  + " " + ranking ;
    }
    
    
}
public class Xep_hang_vdv {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Athlete> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Athlete(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
        }
        for(Athlete x : ls){
            x.addRank(); 
        }
        ls.sort(new Comparator<Athlete>(){
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return Integer.compare(o1.getRanking(), o2.getRanking()) ;
            }
            
        });
        for(Athlete x : ls){
            System.out.println(x);
        }
    }
    
}


//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30