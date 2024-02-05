package danh_sach_mon_hoc_1;

import java.io.* ;
import java.util.* ; 

class Subject implements Comparable<Subject>{
    private String id, name ;
    private int num, time ;

    public Subject(String id, String name, int num, int time) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + num + " " + time ;
    }

    @Override
    public int compareTo(Subject o) {
        if(time != o.getTime())
            return Integer.compare(time,o.getTime() ) ;
        return name.compareTo(o.getName()) ;
    }
}
public class Danh_sach_mon_hoc_1 {

    public static void main(String[] args) {
        File obj = new File("monhoc.dat") ;
        List<Subject> ls = new ArrayList<>() ;
        try{
            Scanner scanner = new Scanner(obj) ; 
            while(scanner.hasNextLine()){
                String[] arr = scanner.nextLine().split(",") ;
                ls.add(new Subject(arr[0].trim(), arr[1].trim(), Integer.parseInt(arr[2].trim()), Integer.parseInt(arr[3].trim()))) ;
            }
            Collections.sort(ls);
            for(Subject x : ls){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
