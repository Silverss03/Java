package tinh_diem_trung_binh;

import java.io.* ; 
import java.util.* ; 

class Student implements Comparable<Student>{
    private String name, id ;
    private Double score ;
    private static Integer id_n = 1 ;

    public Student(String name, Double s1, Double s2, Double s3) {
        this.id = "SV" + String.format("%02d", id_n++) ;
        String[] arr = name.toLowerCase().trim().split("\\s+") ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s ;
        this.score = s1 * 3 + s2 * 3 + s3 * 2;
        this.score /= 8 ;
    }

    public Double getScore() {
        return score;
    }

    public String getId() {
        return id;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + String.format("%.2f", this.score) ;
    }

    @Override
    public int compareTo(Student o) {
        if(score != o.getScore()) 
            return -score.compareTo(o.getScore()) ;
        else
            return id.compareTo(o.getId()) ;
    }
    
}
public class Tinh_diem_trung_binh {

    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("BANGDIEM.in") ;
        Scanner scanner = new Scanner(obj) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ;
            Double s1 = Double.parseDouble(scanner.nextLine()) ;
            Double s2 = Double.parseDouble(scanner.nextLine()) ;
            Double s3 = Double.parseDouble(scanner.nextLine()) ;
            ls.add(new Student(name, s1, s2, s3)) ;
        }
        Collections.sort(ls);
        int rank = 1 ; 
        Double curr = ls.get(0).getScore() ;
        for(int i = 0 ; i < n ; i++){
            if(curr - ls.get(i).getScore() != 0){
                curr = ls.get(i).getScore() ;
                rank++ ;
                System.out.print(ls.get(i));
                System.out.println(" "+ (i + 1));
            }
            else{
                System.out.print(ls.get(i));
                System.out.println(" "+ rank);
            }

        }
    }
    
}
