package lich_thi_hoc_ky;

import java.util.* ; 

class Subject{
    private String id, name ; 

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}

class Schedule{
    private String id_test, id_subject, test_date, test_time, test_grp ;
    private static int id_n = 1 ;
    private static List<Subject> l_sub ;
    private Subject s ; 

    public Schedule(String id_subject, String test_date, String test_time, String test_grp) {
        this.id_test = "T" + String.format("%03d", id_n++) ; 
        for(Subject x : l_sub){
            if(x.getId().equals(id_subject)){
                this.s = x ; 
            }
        }
        this.id_subject = id_subject ; 
        this.test_date = test_date;
        this.test_time = test_time;
        this.test_grp = test_grp;
    }

    public String getId_subject() {
        return id_subject;
    }

    public String getTest_date() {
        return test_date;
    }

    public String getTest_time() {
        return test_time;
    }

    public static void setL_sub(List<Subject> l_sub) {
        Schedule.l_sub = l_sub;
    }

    @Override
    public String toString() {
        return id_test + " "+ s.getId() + " " + s.getName()  + " " + test_date + " " + test_time + " " + test_grp ;
    }

    
}
public class Lich_thi_hoc_ky {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = scanner.nextInt() ; 
        int m = scanner.nextInt() ; 
        scanner.nextLine() ;
        List<Subject> l_sub = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            l_sub.add(new Subject(scanner.nextLine(), scanner.nextLine())) ;
        }
        List<Schedule> l_sche = new ArrayList<>() ; 
        Schedule.setL_sub(l_sub);
        for(int i = 0 ; i < m ; i++){
            l_sche.add(new Schedule(scanner.next(), scanner.next(), scanner.next(), scanner.next())) ;
            if(i != m - 1){
                scanner.nextLine() ;
            }
        }
        l_sche.sort(new Comparator<Schedule>(){
            @Override
            public int compare(Schedule o1, Schedule o2) {
                String[] arr1 = o1.getTest_date().split("/") ;
                String[] arr2 = o2.getTest_date().split("/") ; 
                String s1 = arr1[2] + arr1[1] + arr1[0] ; 
                String s2 = arr2[2] + arr2[1] + arr2[0] ; 
                if(!s1.equals(s2)){
                    return s1.compareTo(s2) ;
                }
                if(!o1.getTest_time().equals(o2.getTest_time())){
                    return o1.getTest_time().compareTo(o2.getTest_time()) ;
                }
                return o1.getId_subject().compareTo(o2.getId_subject()) ;
            }         
        });
        for(Schedule x : l_sche){
            System.out.println(x);
        }
    }
    
}
