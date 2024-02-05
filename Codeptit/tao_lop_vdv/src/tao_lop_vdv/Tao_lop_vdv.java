package tao_lop_vdv;

import java.util.* ;
import model.IVanDongVien;
import model.VanDongVien;

class VDVChay extends VanDongVien implements IVanDongVien{
    private int culy;
    private int soHuyChuong ;

    public VDVChay() {
    }

    public VDVChay(int culy, int soHuyChuong, String ma, String ten, double luong) {
        super(ma, ten, luong);
        this.culy = culy;
        this.soHuyChuong = soHuyChuong;
    }

    public int getCuly() {
        return culy;
    }

    public void setCuly(int culy) {
        this.culy = culy;
    }

    public int getSoHuyChuong() {
        return soHuyChuong;
    }

    public void setSoHuyChuong(int soHuyChuong) {
        this.soHuyChuong = soHuyChuong;
    }

    public void input(Scanner in){
        String regex = "^vdvc\\d{3}$-" ;
        while(true){
            String id = in.nextLine() ;
            if(id.matches(regex)){
                break ;
            }
            else{
                System.out.println("nhap sai");
            }
        }
        String name = in.nextLine() ; 
        while(true){
            
        }
    }
    @Override
    public boolean isMa(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isSo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getLuongThucLinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
public class Tao_lop_vdv {

    public static void main(String[] args) {
        VDVChay a=new VDVChay();
        Scanner in=new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
    
}
