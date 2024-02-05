package danh_sach_phim;
import java.util.* ; 

class Type{
    private String id, name ;
    private static int id_n = 1; 

    public Type(String name) {
        this.id = "TL" +  String.format("%03d", id_n++) ; 
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}

class Movie{
    private String id, name, start; 
    private int eps;
    private Type t ;
    private static int id_n = 1;
    private static List<Type> l_type  ;
    public Movie(String name, String start, String type, int eps) {
        this.id = "P" + String.format("%03d", id_n++) ; 
        for(Type x : l_type){
            if(x.getId().equals(type)){
                this.t = x ; 
            }
        }
        this.name = name;
        this.start = start;
        this.eps = eps;
    }

    public static void setL_type(List<Type> l_type) {
        Movie.l_type = l_type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStart() {
        return start;
    }

    public int getEps() {
        return eps;
    }

    @Override
    public String toString() {
        return id + " " + t.getName()+ " " + start + " " + name + " " + eps ;
    }
    
    
}

public class Danh_sach_phim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = scanner.nextInt() ;
        int m = scanner.nextInt() ; 
        scanner.nextLine() ; 
        List<Type> l_type = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            l_type.add(new Type(scanner.nextLine())) ;
        }
        Movie.setL_type(l_type);
        List<Movie> l_mov = new ArrayList<>() ; 
        for(int i = 0 ; i < m ; i++){
            String id_type = scanner.nextLine() ; 
            String date = scanner.nextLine() ; 
            String name = scanner.nextLine() ; 
            int eps = Integer.parseInt(scanner.nextLine()) ;
            l_mov.add(new Movie(name, date, id_type, eps)) ;
        }
        l_mov.sort(new Comparator<Movie>(){
            @Override
            public int compare(Movie o1, Movie o2) {
                String[] arr1 = o1.getStart().split("/") ;
                String[] arr2 = o2.getStart().split("/") ;
                String s1 = arr1[2] + arr1[1] + arr1[0] ; 
                String s2 = arr2[2] + arr2[1] + arr2[0] ;
                if(!s1.equals(s2)){
                    return s1.compareTo(s2) ;
                }
                if(!o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getName()) ;
                }
                return o2.getEps() - o1.getEps() ;
            }
        });
        for(Movie x : l_mov){
            System.out.println(x);
        }
    }
    
}
