package xet_tuyen;

import java.io.* ; 
import java.text.ParseException;
import java.util.* ;
import java.text.SimpleDateFormat ;
import java.time.Year ;

class Candidate{
    private String name, status, id;
    private Date time ;
    private Long score;
    private Integer age ;
    private static int id_n = 1 ;

    public Candidate(String name, String time, Double theory, Double practice) {
        id = "PH" + String.format("%02d", id_n++) ;
        String[] arr = name.toLowerCase().trim().split("\\s+") ;
        String s = "" ;
        for(String x : arr){
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " " ;
        }
        this.name = s;
        Double add = 0D;
        if(theory >= 8 && practice >= 8){
            add = 1D ;
        }
        else if(theory >= 7.5 && practice >= 7.5){
            add = 0.5 ;
        }
        this.score = Math.round((theory + practice)/2 + add) ;
        this.age = 2021 - Integer.valueOf(time.substring(time.length() - 4)) ;
        if(score > 10){
            score = 10L ;
        }
        if(score < 5){
            this.status = "Truot" ;
        }
        else if(score < 7){
            this.status = "Trung binh" ;
        }
        else if(score == 7){
            this.status = "Kha" ;
        }
        else if(score == 8){
            this.status = "Gioi" ;
        }
        else{
            this.status = "Xuat sac" ;
        }
    }
    @Override
    public String toString(){
        return id + " " + name + age + " " + score + " " + status ;
    }
}
public class Xet_tuyen {

    public static void main(String[] args) throws FileNotFoundException{
        File obj = new File("XETTUYEN.in") ;
        Scanner scanner = new Scanner(obj) ; 
        List<Candidate> ls = new ArrayList<>() ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ;
            String time = scanner.nextLine() ;
            Double theory = Double.parseDouble(scanner.nextLine()) ;
            Double practice = Double.parseDouble(scanner.nextLine() );
            Candidate tmp = new Candidate(name, time, theory, practice) ;
            ls.add(tmp) ;
        }
        for(Candidate x : ls){
            System.out.println(x);
        }
    }
}
