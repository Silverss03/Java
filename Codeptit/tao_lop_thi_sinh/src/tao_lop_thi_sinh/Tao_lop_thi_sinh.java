package tao_lop_thi_sinh;

import java.text.DecimalFormat;
import java.util.* ; 

class Student{
    private String id, name, ethnic, status ; 
    private double score, award = 0D; 

    public Student(String id, String name, String ethnic, Double s1, Double s2, Double s3, Double award) {
        this.id = id;
        this.name = name;
        this.ethnic = ethnic;
        this.score = s1 + s2 + s3 ;
        if(award == 1D){
            this.award += 1.5;
        }
        else if(award == 2D){
            this.award += 1.0 ;
        }
        else if(award == 3D){
            this.award += 0.5 ;
        }
        if(ethnic.equalsIgnoreCase("kinh") == false){
            this.award += 1 ;
        }
        if(id.substring(0, 3).equals("KV2") ){
            this.award += 1 ;
        }
        else if(id.substring(0, 3).equals("KV3") ){
            this.award += 2 ;
        }
        if(this.score + this.award >= 26.8){
            this.status = "TRUNG TUYEN" ;
        }
        else{
            this.status = "TRUOT" ;
        }
    }
    
    public String toString(){
        return id + " " + name + " " + new DecimalFormat("#.#").format(award) + " "+ new DecimalFormat("#.#").format(score) + " " + status ; 
    }
}
public class Tao_lop_thi_sinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ; 
        List<Student> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            String id = scanner.nextLine() ; 
            String name = scanner.nextLine() ;
            String ethnic = scanner.nextLine() ;
            Double s1 = Double.parseDouble(scanner.nextLine()) ;
            Double s2 = Double.parseDouble(scanner.nextLine()) ;
            Double s3 = Double.parseDouble(scanner.nextLine()) ;
            Double award = Double.parseDouble(scanner.nextLine()) ;
            ls.add(new Student(id, name, ethnic, s1, s2, s3, award)) ;
        }
        for(Student x : ls){
            System.out.println(x);
        }
    }
}

//2
//KV2A002
//To An An
//kinh
//9
//9
//7
//0
//KV3A004
//Lo Van Lo
//Tay
//9
//9
//7
//3
