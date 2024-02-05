package truy_van_sinh_vien;

import java.util.* ; 

class Student{
    private String id_f, id_e, name, b_day, address ; 
    private int age ; 
    private static int id_n = 1 ;


    public String getName() {
        return name;
    }

    public String getB_day() {
        return b_day;
    }

    public String getAddress() {
        return address;
    }

    public static int getId_n() {
        return id_n;
    }

    public String getId_f() {
        return id_f;
    }

    public String getId_e() {
        return id_e;
    }

    public int getAge() {
        return age;
    }

    
    public Student(String id, String name, String b_day, String address) {
        this.id_f = "SV" + String.format("%02d", id_n++);
        this.id_e = id ; 
        String[] arr = name.strip().toLowerCase().split("\\s+") ;
        String s = "" ; 
        for(String x : arr){
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s.strip();
        this.b_day = b_day;
        if(this.b_day.charAt(2) != '/'){
            this.b_day = "0" + this.b_day ; 
        }
        if(this.b_day.charAt(5) != '/'){
            this.b_day = this.b_day.substring(0, 3) + "0" + this.b_day.substring(3 ) ;
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return  id_f + " " + id_e + " " + name + " " + b_day + " " + address  ;
    }
    
}
public class Truy_van_sinh_vien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Student> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
        }
        int q = Integer.parseInt(scanner.nextLine()) ; 
        while(q-- > 0){
            String[] inp = scanner.nextLine().split("\\s+") ;
            boolean found = false ;
            switch (inp[0]) {
                case "1" ->                     {
                        ls.sort(new Comparator<Student>(){
                            @Override
                            public int compare(Student o1, Student o2) {
                                return o1.getName().compareTo(o2.getName()) ;
                            }
                        }); 
                        String province = "" ;
                        for(int i = 1 ; i <  inp.length ; i++){
                            province += inp[i] + " " ;
                        }
                        for(Student x : ls){
                            if(x.getAddress().equals(province.strip())){
                                found = true ;
                                System.out.println(x);
                            }
                        }   
                        if(found)
                            System.out.println();
                    }
                case "2" ->                     {
                        ls.sort(new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                String[] arr1 = o1.getB_day().split("/");
                                String[] arr2 = o2.getB_day().split("/");
                                int y_1 = Integer.parseInt(arr1[2]);
                                int y_2 = Integer.parseInt(arr2[2]);
                                int m_1 = Integer.parseInt(arr1[1]);
                                int m_2 = Integer.parseInt(arr2[1]);
                                int d_1 = Integer.parseInt(arr1[0]);
                                int d_2 = Integer.parseInt(arr2[0]);

                                if (y_1 != y_2) {
                                    return y_2 - y_1; 
                                } else if (m_1 != m_2) {
                                    return m_2 - m_1;
                                } else {
                                    return d_2 - d_1; 
                                }
                            }
                        });

                        String y = inp[1] ;
                        for(Student x : ls){
                            if(x.getB_day().substring(6).equals(y)){
                                System.out.println(x);
                                found = true ;
                            }
                        }      
                        if(found)
                            System.out.println();
                    }
                case "3" -> {
                    found = true ;
                    ls.sort(new Comparator<Student>(){
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getId_e().compareTo(o2.getId_e()) ;
                        }
                    }); 
                    for(Student x : ls){
                        System.out.println(x);
                    }
                    System.out.println("");
                }
                default ->                     {
                        String s = "" ;
                        for(int i = 1; i < inp.length ; i++){
                            s += inp[i].toLowerCase() + " ";
                        }
                        ls.sort(new Comparator<>(){
                            @Override
                            public int compare(Student o1, Student o2) {
                                return o1.getId_f().compareTo(o2.getId_f()) ;
                            }
                            
                        });
                        for(Student x : ls){
                            if(x.getName().toLowerCase().contains(s.strip())){
                                found = true ;
                                System.out.println(x);
                            }
                        }   
                        if(found)
                            System.out.println("");
                    }
                
            }
            if(!found){
                System.out.println("-1");
                System.out.println("");
            }  
        }
    }
    
}
