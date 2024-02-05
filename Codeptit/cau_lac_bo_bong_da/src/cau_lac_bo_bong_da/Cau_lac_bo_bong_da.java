package cau_lac_bo_bong_da;

import java.util.* ;

class Club{
    private String match_id, name, fc_id ;
    private int income, price  ; 

    public Club( String fc_id, String name, int price) {
        this.name = name;
        this.fc_id = fc_id;
        this.price = price ;
        this.income = 0 ; 
    }

    public String getFc_id() {
        return fc_id;
    }
    
    public void setIncome(String match_id, int amount){
        this.income = amount * this.price;
        this.match_id = match_id ; 
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    
    @Override
    public String toString() {
        return match_id + " " + name + " " + income ;
    }
    
    
}
public class Cau_lac_bo_bong_da {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine() ); 
        List<Club> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Club(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()))) ;
        }
        int k = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < k ; i++){
            String s = scanner.next() ;
            for(Club x : ls){
                if(s.contains(x.getFc_id())){
                    x.setIncome(s, scanner.nextInt());
                }
            }
        }
        ls.sort(new Comparator<Club>(){
            @Override
            public int compare(Club o1, Club o2) {
                if(o1.getIncome() != o2.getIncome()){
                    return o2.getIncome() - o1.getIncome() ;
                }
                else{
                    return o1.getName().compareTo(o2.getName()) ;
                }
            }
        });
        for(Club x : ls){
            System.out.println(x);
        }
    }    
}

//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000