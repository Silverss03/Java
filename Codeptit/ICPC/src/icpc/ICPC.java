package icpc;

import java.util.* ; 

class Team{
    private String id, name, school ;
    private static int id_n = 1 ;

    public Team(String name, String school) {
        this.id = "Team" + String.format("%02d", id_n++) ; 
        this.name = name;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }
    
}

class Student{
    private String id, name ; 
    private static List<Team> l_team ;  
    private Team t ; 
    private static int id_n = 1 ;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public static void setL_team(List<Team> l_team) {
        Student.l_team = l_team;
    }

    public Student(String name, String id_team) {
        this.id = "SV" + String.format("%02d", id_n++) ; 
        this.name = name;
        for(Team x : l_team){
            if(x.getId().equals(id_team)){
                this.t = x ;
            }
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + t.getName() + " " + t.getSchool();
    }
    
    
}
public class ICPC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Team> l_team = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            l_team.add(new Team(scanner.nextLine(), scanner.nextLine())) ;
        }
        Student.setL_team(l_team);
        int m = Integer.parseInt(scanner.nextLine()) ; 
        List<Student> l_stu = new ArrayList<>() ; 
        for(int i = 0 ; i < m ; i++){
            l_stu.add(new Student(scanner.nextLine(), scanner.nextLine())) ;
        }
        l_stu.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()) ;
            }
        });
        for(Student x : l_stu){
            System.out.println(x);
        }
    }
    
}
