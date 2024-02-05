/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danh_sach_ca_thi;

import java.io.* ; 
import java.text.ParseException;
import java.util.* ; 

import java.text.SimpleDateFormat;
class Test{
    private String id , room, str_date, str_time ; 
    private long date, time ; 
    private static int id_n = 1 ;

    public Test(String room, String str_date, String str_time, long date, long time) {
        this.id = String.format("C%03d", id_n++) ;
        this.room = room;
        this.str_date = str_date;
        this.str_time = str_time;
        this.date = date ;
        this.time = time ;
    }

    public String getId() {
        return id;
    }

    
    public long getDate() {
        return date;
    }

    public long getTime() {
        return time;
    }
    
    @Override
    public String toString(){
        return id + " " + str_date + " " + str_time + " " + room ; 
    }
    
    
}
public class Danh_sach_ca_thi {

    public static void main(String[] args) {
        File obj = new File("CATHI.in") ;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy") ;
        try{
            Scanner scanner = new Scanner(obj) ; 
            int n = Integer.parseInt(scanner.nextLine()) ; 
            List<Test> ls = new ArrayList<>() ;
            for(int i = 0 ; i < n ; i++){
                String date = scanner.nextLine() ;
                try{
                    Date a = sdf.parse(date) ; 
                    long duration = a.getTime() * 1000 * 60 * 60 * 24 ;
                    String time = scanner.nextLine() ; 
                    String room = scanner.nextLine() ;
                    long min = Long.parseLong(time.substring(0, 2)) * 60 + Long.parseLong(time.substring(3)) ;
                    ls.add(new Test(room, date, time, duration, min)) ;
                }
                catch(ParseException e){
                    
                }

            }
            ls.sort(new Comparator<Test>(){
                @Override
                public int compare(Test o1, Test o2) {
                    if(o1.getDate() == o2.getDate()){
                        if(o1.getTime() == o2.getTime()){
                            return o1.getId().compareTo(o2.getId()) ;
                        }
                        return Long.compare(o1.getTime(), o2.getTime()) ;
                    }
                    return Long.compare(o1.getDate(), o2.getDate()) ;
                }
                
            });
            for(Test x : ls){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
