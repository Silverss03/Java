package xep_loai;

import java.util.* ;
class Student implements Comparable<Student>{
    private String id, name, status ;
    private Double score ;
    private static int id_n = 1 ;

    public Student(String name, Integer s1, Integer s2, Integer s3) {
        this.id = "SV" + String.format("%02d", id_n++) ;
        String[] arr = name.toLowerCase().trim().split("\\s+") ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s;
        this.score = s1*0.25 + s2*0.35 + s3*0.4 ;
        if(this.score < 5){
            this.status = "KEM" ;
        }
        else if(this.score < 6.5){
            this.status = "TRUNG BINH" ;
        }
        else if(this.score < 8){
            this.status = "KHA" ;
        }
        else{
            this.status = "GIOI" ;
        }
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString(){
        return id +  " " + name + String.format("%.2f", score) + " " + status ;
    }
    @Override
    public int compareTo(Student o) {
        return -score.compareTo(o.getScore()) ;
    }
    
    
}
