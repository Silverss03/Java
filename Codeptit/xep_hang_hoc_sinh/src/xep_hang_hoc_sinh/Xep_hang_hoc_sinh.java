package xep_hang_hoc_sinh;

import java.text.DecimalFormat;
import java.util.* ; 

class Student{
    private String id, name, status ;
    private double point;
    private int rank ;
    private static List<Double> ls = new ArrayList<>() ; 
    private static int id_n = 1 ; 

    public Student(String name, double point) {
        this.id = "HS" + String.format("%02d", id_n++) ; 
        this.name = name;
        this.point = point;
        if(this.point >= 9){
            this.status = "Gioi" ;
        }
        else if(this.point >= 7){
            this.status = "Kha" ;
        }
        else if(this.point >= 5){
            this.status = "Trung Binh";
        }
        else{
            this.status = "Yeu" ;
        }
        ls.add(point) ;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public double getPoint() {
        return point;
    }

    public double getRank() {
        return rank;
    }

    public static List<Double> getLs() {
        return ls;
    }
    
    public void addRank(){
        Collections.sort(ls);
        int r = 1 ; 
        double curr = 0 ;
        for(int i = ls.size() - 1; i >= 0 ; i--){    
            if(this.point == ls.get(i)){
                this.rank = r ; 
                break ;
            }
            r++ ; 
        }
    }

    @Override
    public String toString() {
        return id + " " + name  + " " + String.format("%.1f", point)+ " " + status+ " " + rank;
    }
    
    
}

public class Xep_hang_hoc_sinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> list = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            list.add(new Student(scanner.nextLine(), Double.parseDouble(scanner.nextLine()))) ;
        }
        for(Student x : list){
            x.addRank(); 
            System.out.println(x);
        }
        
    }
    
}

//4
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
//Dai ca ca
//9.2


//HS01 Tran Minh Hieu 5,9 Trung Binh 4
//HS02 Nguyen Bao Trung 8,6 Kha 3
//HS03 Le Hong Ha 9,2 Gioi 1
//HS04 NBT 9,2 Gioi 1