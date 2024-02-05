/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danh_sach_doanh_nghiep_nhan_svtt_1;

import java.util.* ; 

class Enterprise implements Comparable<Enterprise>{

    private String id, name ;
    private int s_num ;

    public Enterprise(String id, String name, int s_num) {
        this.id = id;
        this.name = name;
        this.s_num = s_num;
    }

    public String getId() {
        return id;
    }

    public int getS_num() {
        return s_num;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + s_num ; 
    }
    
    @Override
    public int compareTo(Enterprise o){
        if(s_num != o.getS_num())
            return -Integer.compare(s_num, o.getS_num()) ;
        return id.compareTo(o.getId()) ;
    }
    
} 
public class Danh_sach_doanh_nghiep_nhan_svtt_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int e_num = Integer.parseInt(scanner.nextLine()) ;
        Enterprise[] ls = new Enterprise[e_num] ; 
        for(int i = 0 ; i < e_num ; i++){
            String id = scanner.nextLine() ; 
            String name = scanner.nextLine() ; 
            int num = Integer.parseInt(scanner.nextLine()) ;
            ls[i] = new Enterprise(id,name,num) ; 
        }
        Arrays.sort(ls);
        int q = Integer.parseInt(scanner.nextLine()) ; 
        while(q-- > 0){
            int a = scanner.nextInt() ;
            int b = scanner.nextInt() ;
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(Enterprise x :ls){
                if(x.getS_num() >= a && x.getS_num() <= b){
                    System.out.println(x);
                }
            }
        }
    }
    
}

//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50