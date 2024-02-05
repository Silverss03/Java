package danh_sach_sv_trong_file;

import java.io.* ; 
import java.util.* ;

public class Danh_sach_sv_trong_file {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            students[i] = new Student(msv, name, lop, email);
        }
        Arrays.sort(students);
        for (Student i : students) {
            System.out.println(i);
        }
    }
}
    
