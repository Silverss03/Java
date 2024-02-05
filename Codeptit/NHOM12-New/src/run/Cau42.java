
package run;

import controller.NganHang;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Cau42 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        //n.out();
        Scanner in=new Scanner(System.in);
        double tu=Double.parseDouble(in.nextLine());
        double den=Double.parseDouble(in.nextLine());
        n.timGDVangTuGiaDenGia(tu, den);
    }
}
