import java.util.* ;

class Teacher{
    private String id, name ; 
    private long sal_rank, allowance, income ;
    private static int ht = 0, hp = 0;
    
    public Teacher(String id, String name, long bas_sal) {
        this.id = id;
        if(id.substring(0,2).equals("HT")){   
            ht++;
            if(ht > 1) this.id = "";    
        }
        if(id.substring(0,2).equals("HP")){   
            hp++;
            if(hp > 2) this.id = "";  
        }
        this.name = name;
        this.sal_rank = Integer.parseInt(id.substring(2));
        if(id.substring(0,2).equals("HT")) this.allowance = 2000000;
        else if(id.substring(0,2).equals("HP")) this.allowance = 900000;
        else if(id.substring(0,2).equals("GV")) this.allowance = 500000;
        else this.allowance = 0;
        this.income = bas_sal*sal_rank + this.allowance;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + sal_rank + " " + allowance + " " + income;
    }
    
    
}

public class Bang_thu_nhap_giao_vien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Teacher> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            Teacher x = new Teacher(scanner.nextLine(), scanner.nextLine(), Long.parseLong(scanner.nextLine())) ;
            if(x.getId().length() > 0){
                ls.add(x) ;
            } 
        }
        for(Teacher x : ls){
            System.out.println(x);
        }
    }
    
}