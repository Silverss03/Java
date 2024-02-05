package ds_sv;

import java.util.* ; 
import java.time.Year ;
public class DanhSach {
    private Sinhvien[] arr ; 
    private int n = 0 ;

    public DanhSach() {
        arr = new Sinhvien[100] ;
        Sinhvien a = new Sinhvien("B21DCCN515", "Nguyen Huu Manh", 20) ;
        Sinhvien b = new Sinhvien("B21DCCN516", "Nguyen Nhat Minh", 20) ;
        Sinhvien c = new Sinhvien("B21DCCN517", "John Wick", 35) ;
        arr[n++] = a ;
        arr[n++] = b ;
        arr[n++] = c ; 
    } 

    public DanhSach(Sinhvien[] arr) {
        this.arr = arr;
    }
    
    private boolean id_exit(String id){
        for(int i = 0 ; i < n ; i++){
            if(arr[i].getId().equalsIgnoreCase(id)){
                return true ;
            }
        }
        return false; 
    }
    
    public void input(){
        arr[n] = new Sinhvien() ;
        Scanner scanner = new Scanner(System.in) ; 
        String regex_id = "^B\\d{2}DC(CN|AT)\\d{3}$" ; 
        String regex_age = "^(?:[1-9][0-9]?|100)$" ; 
        String regex_name = "^[A-za-z ]+" ;
        System.out.println("Nhap ma sinh vien:");
        while(true){
            String id = scanner.nextLine() ;
            if(id.toUpperCase().matches(regex_id) && !id_exit(id)){
                arr[n].setId(id.toUpperCase()) ;
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        while(true){
            System.out.println("Nhap ten:");
            String name = scanner.nextLine() ;        
            if(name.matches(regex_name)){
                arr[n].setName(name) ;
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        while(true){
            System.out.println("Nhap tuoi:");
            String age = scanner.nextLine() ; 
            Integer s_age ;
            s_age = Integer.valueOf(age);
            if(age.matches(regex_age) && s_age > 0){
                arr[n].setAge(s_age) ;
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        n++ ;
    }
    
    public void out(){
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
        }
    }
    
    public void timTheoNS(){
        Scanner scanner = new Scanner(System.in) ; 
        String regex_y = "^\\d{4}$"  ; 
        Integer min, max ;
        while(true){
            System.out.println("Sinh tu nam:");
            String y = scanner.nextLine() ; 
            max = Integer.valueOf(y);
            if(y.matches(regex_y) && max > 0){
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        while(true){
            System.out.println("Den nam:");
            String y = scanner.nextLine() ; 
            min = Integer.valueOf(y);
            if(!y.matches(regex_y) || min <= 0){
                System.out.println("Nhap lai!");
            }
            else{
                break ;
            }
        }
        Year tmp = Year.now() ;
        Integer y = tmp.getValue() ;
        min = y - min ;
        max = y - max ; 
        for(int i = 0 ; i < n ; i++){
            if(arr[i].getAge() >= min && arr[i].getAge() <= max){
                System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
            }          
        }
    }
    
    public void timTheoTen(){
        while(true){
            System.out.println("Nhap tu khoa:");
            Scanner scanner = new Scanner(System.in) ; 
            String regex_name = "^[A-za-z ]+" ;    
            String key = scanner.nextLine() ;
            if(key.matches(regex_name)){
                for(int i = 0 ; i < n ; i++){
                    if(arr[i].getName().contains(key)){
                        System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
                    }                 
                }
                break ;
            }
        }
    }
    
    public void sua(){
        while(true){
            System.out.println("Nhap ma sinh vien cua sinh vien muon sua");
            String regex_id = "^B\\d{2}DC(CN|AT)\\d{3}$" ;
            String regex_age = "^(?:[1-9][0-9]?|100)$" ; 
            String regex_name = "^[A-za-z ]+" ;
            Scanner scanner = new Scanner(System.in) ; 
            String id = scanner.nextLine() ;
            if(id.toUpperCase().matches(regex_id) && id_exit(id)){
                String new_id ;
                String new_name ; 
                Integer new_age ;
                while(true){
                    System.out.println("Nhap lai ma sinh vien:");
                     new_id = scanner.nextLine() ; 
                    if(new_id.toUpperCase().matches(regex_id) && !id_exit(new_id)){
                        break ;
                    }
                }
                while(true){
                    System.out.println("Nhap lai ten:");
                    new_name = scanner.nextLine() ;
                    if(new_name.matches(regex_name)){
                        break ;
                    }
                }
                while(true){
                    System.out.println("Nhap lai tuoi:");
                    String tmp = scanner.nextLine() ; 
                    if(tmp.matches(regex_age)){
                        new_age = Integer.valueOf(tmp) ;
                        break ;
                    }
                }
                for(int i = 0 ; i < n ; i++){
                    if(arr[i].getId().equals(id)){
                        arr[i].setId(new_id) ;
                        arr[i].setName(new_name) ; 
                        arr[i].setAge(new_age) ;
                    }                 
                }
                break ;
            }
            else{
                System.out.println("Ma khong ton tai hoac nhap loi! Nhap lai!");
            }
        }
        
        
    }
}
