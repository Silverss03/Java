package hoc_phi;

import view.InvoiceView;
import vn.edu.ptit.Invoice;
import java.util.* ;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;
class PaymentController {
    private Invoice a ;
    private int id = 1 ;

    public PaymentController() {
        Scanner  scanner = new Scanner(System.in) ;
        Student st = new Student(scanner.nextLine(), scanner.nextLine()) ;
        ArrayList<Subject> alSubject;
        alSubject = new ArrayList<>();
        long n ;
        n = Long.parseLong(scanner.nextLine());
        for(long i = 0 ; i < n ; i++){
            String code = scanner.nextLine() ;
            String name = scanner.nextLine() ; 
            int credit = Integer.parseInt(scanner.nextLine()) ;
            Subject tmp = new Subject(name, code, credit); 
            alSubject.add(tmp) ; 
        }
        String code = scanner.nextLine() ; 
        String name = scanner.nextLine() ; 
        double creditPrice = Double.parseDouble(scanner.nextLine()) ;
        Rule r = new Rule(code, name, creditPrice) ;
        a = new Invoice(r) ;
        a.setSt(st);
        a.setAlSubject(alSubject); 
        double sum = 0 ;
        for(Subject element : alSubject){
            int tmp = element.getCredit() ;
            sum += creditPrice * tmp ;
        }
        a.setAmount(sum);
        a.setId(id);
        id++ ;
    }
    
    public Invoice getInvoice(){
        return a ;
    }
}
public class Hoc_phi {


    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    
}
