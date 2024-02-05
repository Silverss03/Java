package bang_diem_hs;

import java.util.* ;

class Student{
    private String id , name, status ;
    private double average ;
    private static int id_n = 1 ; 

    public Student(String name, double s1, double s2, double s3, double s4, double s5,
                    double s6, double s7, double s8, double s9, double s10) {
        this.id = "HS" + String.format("%02d", id_n++) ; 
        this.name = name;
        this.average = (s1 * 2 + s2 * 2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 ) / 12  ;
        this.average = (double)Math.round(this.average * 10)/10  ;
        if(this.average >= 9){
            this.status = "XUAT SAC" ;
        }
        else if(this.average >= 8 ){
            this.status = "GIOI" ; 
        }
        else if(this.average >= 7){
            this.status = "KHA" ;
        }
        else if(this.average >= 5){
            this.status = "TB" ;
        }
        else{
            this.status = "YEU" ;
        }
    }

    public double getAverage() {
        return average;
    }

    
    @Override
    public String toString() {
        return  id + " " + name + " " + String.format("%.1f", average) + " " + status ;
    }
    
    
    
    
}
public class Bang_diem_hs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()))) ;
            scanner.nextLine() ;
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getAverage(), o1.getAverage()) ;
            }
            
        });
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0