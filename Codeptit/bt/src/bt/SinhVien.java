package bt;

import java.util.Scanner ;
public class SinhVien {
    private String msv, ten ;
    private boolean gtinh ;
    private double diem1, diem2, gpa ;
     
    
    public SinhVien(){
        
    }
    
    public SinhVien(String msv, String ten, boolean gtinh, double diem1, double diem2){
        this.msv = msv ;
        this.ten = ten ;
        this.gtinh = gtinh ;
        this.diem1 = diem1 ;
        this.diem2 = diem2 ;
        this.gpa = (diem1 + diem2)/2 ;
    }
    public String getMsv(){
        return this.msv ;
    }
    public String getTen(){
        return this.ten ;
    }
    public boolean isGtinh(){
        return this.gtinh ;
    }
    public double getDiem1(){
        return this.diem1 ;
    }
    public double getDiem2(){
        return this.diem2 ;
    }
    public double getGpa(){
        return this.gpa ;
    }
    
    public void setMsv(String ma){
        this.msv = ma ;
    }
    
    public void setTen(String ten){
        this.ten = ten ;
    }
    
    public void setGtinh(boolean gtinh){
        this.gtinh = gtinh ;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setGpa(){
        this.gpa = (diem1 + diem2)/2 ;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in) ;
        this.msv = scanner.nextLine() ;
        this.ten = scanner.nextLine() ;
        this.gtinh = Boolean.parseBoolean(scanner.nextLine()) ;
        this.diem1 = Double.parseDouble(scanner.nextLine()) ;
        this.diem2 = Double.parseDouble(scanner.nextLine()) ;
        this.gpa = (this.diem1 + this.diem2)/2 ;
    }
    @Override
    public String toString(){
        return this.msv + " " + this.ten + " " + (this.gtinh? "Nam" : "Nu" ) + " " + this.diem1 + " " + this.diem2 + " " + this.gpa;
    }
 
}


