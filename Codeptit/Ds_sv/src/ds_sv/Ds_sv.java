package ds_sv;
 
import java.util.* ;
public class Ds_sv {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
       DanhSach s=new DanhSach();
        while(true){
            System.out.print("""
                1. Nhập 1 Sinh vien
                2. Viet ra danh sach
                3. danh sach nam sinh tu... den...
                4. tim theo ten 
                5. sua sinh vien                            
                0. Thoat             
                             """);
            System.out.print("Ban chon (0->4): ");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            System.out.println("----------------");
            switch(chon){
                case 0->{
                    System.out.println("bye!!!");
                    System.exit(0);
                }
                case 1->{
                    s.input();
                }
                case 2->{
                    s.out();
                }
                case 3->{
                    s.timTheoNS();
                }
                case 4-> s.timTheoTen();
                case 5-> s.sua();
                default-> System.out.println("chi chon 0->4");
            }
        }
    }
    
}
