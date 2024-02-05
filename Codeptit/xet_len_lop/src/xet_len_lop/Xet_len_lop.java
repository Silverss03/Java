package xet_len_lop;
 
import java.util.* ;
import java.io.File ;
import java.io.FileNotFoundException ; 
import java.text.DecimalFormat;

class Student{
    private static int id_n = 1;
    private String name, rank, id ;
    private Double GPA ;

    public Student(String name, String GPA, String pos ) {
        this.id = String.format("HS%03d", id_n++) ;
        String[] arr = name.toLowerCase().trim().split("\\s+") ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s ;
        String[] points = GPA.split("\\s+") ;
        Double p1, p2 , p3 ; 
        p1 = Double.parseDouble(points[0]) ;
        p2 = Double.parseDouble(points[1]) ;
        p3 = Double.parseDouble(points[2]) ;
        this.GPA =  p1+ p2 + p3 ;
        this.GPA /= 3 ;
        pos = pos.trim() ;
        if(pos.equalsIgnoreCase("LT")){
            this.GPA += 0.4 ; 
        }
        else if(pos.equals("LP") || pos.equals("BT")){
            this.GPA += 0.2 ;
        }
        if(p1 == 0D || p2 == 0D || p3 == 0D || this.GPA < 5D){
            this.rank = "HOC LAI" ;
        }
        else if(p1 <  5D || p2 < 5D || p3 < 5D || (this.GPA >= 5 && this.GPA < 6.5)){
            this.rank = "Trung binh" ;
        }
        else if(this.GPA >= 6.5 && this.GPA < 8){
            this.rank = "Kha" ;
        }
        else{
            this.rank = "Gioi" ;
        }
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + new DecimalFormat("#.#").format(this.GPA) + " " + this.rank ;
    }
}

public class Xet_len_lop {

    public static void main(String[] args) {
        File obj = new File("diemthi.dat") ;
        List<Student> ls = new ArrayList<>() ; 
        try{
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            for(int i = 0 ; i < n ; i++){
                ls.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
            }
            for(Student x : ls){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
