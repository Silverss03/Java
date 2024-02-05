package danh_sach_thuc_tap_1;

import java.util.* ; 

class Student{
    private String id, num, name, group, email, company ; 
    private static int n = 1 ;

    public Student(String id, String name, String group, String email, String company){ 
        this.num = Integer.toString(n++) ;
        this.id = id;
        this.name = name;
        this.group = group;
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public String toString() {
        return num + " " + id + " " + name + " " + group + " " + email + " " + company ;
    }
    
    
}
public class Danh_sach_thuc_tap_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId()) ;
            }
        });
        int q = Integer.parseInt(scanner.nextLine()) ;
        while(q-- > 0){
            String cpn = scanner.nextLine() ;
            for(Student x : ls){
                if(x.getCompany().equalsIgnoreCase(cpn)){
                    System.out.println(x);
                }
            }
        }
    }
    
}

//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT

//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT