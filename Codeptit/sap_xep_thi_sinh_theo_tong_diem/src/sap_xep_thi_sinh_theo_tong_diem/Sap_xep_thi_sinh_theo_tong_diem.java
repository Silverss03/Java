
package sap_xep_thi_sinh_theo_tong_diem;

import java.text.DecimalFormat;
import java.util.* ; 

class Student implements Comparable<Student>{
    private String id, name, ethnic, status ; 
    private Double score, award = 0D, sum; 

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
        this.sum = this.score + this.award ;
    }

    public double getSum() {
        return sum;
    }

    
    @Override
    public String toString(){
        return id + " " + name + " " + new DecimalFormat("#.#").format(award) + " "+ new DecimalFormat("#.#").format(score) + " " + status ; 
    }

    @Override
    public int compareTo(Student o) {
        return -sum.compareTo(o.getSum()) ;
    }

}
public class Sap_xep_thi_sinh_theo_tong_diem {

    /**
     * @param args the command line arguments
     */
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
        Collections.sort(ls);
        for(Student x : ls){
            System.out.println(x);
        }
        
    }
    
}
//3
//KV1A001
//To An An
//tay
//9
//9
//8
//0
//KV3A008
//Lai thi Ha
//kinh
//8
//8
//9
//0
//KV2A765
//Vu Tuan
//kinh
//7
//8
//6
//0