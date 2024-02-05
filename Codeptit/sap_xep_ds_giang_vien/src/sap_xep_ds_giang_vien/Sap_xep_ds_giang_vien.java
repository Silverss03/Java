package sap_xep_ds_giang_vien;

import java.util.* ; 

class Teacher{
    private String id, name, subject ; 
    private static int id_n = 1 ;

    public Teacher(String name, String subject) {
        this.id = "GV" + String.format("%02d", id_n++) ;
        this.name = name;
        String[] arr = subject.split("\\s+") ;
        String s = "" ;
        for(String x : arr){
            s += x.toUpperCase().charAt(0) ;
        }
        this.subject = s;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + subject ;
    }
    
    
}
public class Sap_xep_ds_giang_vien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Teacher> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Teacher(scanner.nextLine(), scanner.nextLine())) ;
        }
        ls.sort(new Comparator<Teacher>(){
            @Override
            public int compare(Teacher o1, Teacher o2) {
                String[] arr1 = o1.getName().split("\\s+") ; 
                String[] arr2 = o2.getName().split("\\s+") ;
                String n1 = arr1[arr1.length - 1] ;
                String n2 = arr2[arr2.length - 1] ;
                if(n1.equalsIgnoreCase(n2)){
                    return o1.getId().compareTo(o2.getId()) ;
                }
                else{
                    return n1.compareTo(n2) ;
                }
            }
            
        });
        for(Teacher x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin