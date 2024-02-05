
package baikt1;

import java.util.Scanner;


public class SoNguyen {
    private int num;

    public SoNguyen() {
        Scanner sc=new Scanner(System.in);
        System.out.print("number:");
        num=sc.nextInt();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    public void getTong(){
        int t=0;
        for(int i=0;i<num;i++){
            t+=i;
        }
        System.out.println("Tong:"+t);
    }
    private boolean isNgTo(int n){
        if(n==1 || n==0){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        }
        return true;
    }
    public void daySoNT(){
        System.out.print("Day so:");
        for(int i=0;i<=num;i++){
            if(isNgTo(i))
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
