/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bang_xep_hang;

import java.util.* ; 

class Student{
    private String name ;
    private int correct, submit ;

    public Student(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getCorrect() {
        return correct;
    }

    public int getSubmit() {
        return submit;
    }

    @Override
    public String toString() {
        return  name + " " + correct + " " + submit ;
    }
    
}
public class Bang_xep_hang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ; 
            int ac = scanner.nextInt() ;
            int sub = scanner.nextInt() ;
            if(i != n - 1){
                scanner.nextLine() ;
            }
            ls.add(new Student(name, ac, sub)) ;
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCorrect() == o2.getCorrect()){
                    if(o1.getSubmit() == o2.getSubmit()){
                        return o1.getName().compareTo(o2.getName()) ;
                    }
                    else{
                        return o1.getSubmit() - o2.getSubmit() ;
                    }
                }
                return o2.getCorrect() - o1.getCorrect()    ;
            }
            
        });
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}

//2
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600