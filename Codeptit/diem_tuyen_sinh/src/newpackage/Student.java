/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_tuyen_sinh;

/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student>{
    private String id, name, ethnic, region, status ;
    private Double bas_point ;
    private Double point ;
    private static int id_n = 1 ;
    public Student(String name, double bas_point, String ethnic, String region){
        this.id = "TS" + String.format("%02d", id_n++) ;
        String[] arr = name.trim().toLowerCase().split(("\\s+")) ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0,1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s.trim() ;
        this.ethnic = ethnic ; 
        this.region = region ; 
        this.point = bas_point + bonus(this.ethnic, this.region) ;
        if(this.point >= 20.5){
            this.status = "Do" ;
        }
        else{
            this.status = "Truot" ;
        }
    }
    private Double bonus(String ethnic, String region){
        Double bonus_p = 0D ;
        if(region.equals("1")){
            bonus_p += 1.5 ;
        }         
        else if(region.equals("2")){
            bonus_p += 1D ;
        }
        if(!ethnic.equals("Kinh")){
            bonus_p += 1.5 ;
        }
        return bonus_p ;
    }

    public String getId() {
        return id;
    }

    public Double getPoint() {
        return point;
    }
   
    @Override
    public String toString(){
        return this.id + " " + this.name + " " +String.format("%.1f",this.point) + " " + this.status ;
    }

    @Override
    public int compareTo(Student o) {
        if(point == o.getPoint()){
            return id.compareTo(o.getId()) ;
        }
        return -point.compareTo(o.getPoint()) ;
    }
}
