
package sap_xep_thoi_gian;

import java.util.* ; 

class Time{
    private int hour, minute, second ; 

    public Time() {
        hour = minute = second = 0 ;
    }

    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}

class TimeComparator implements Comparator<Time> {

    @Override
    public int compare(Time o1, Time o2) {
        if(o1.getHour() == o2.getHour()){
            if(o1.getMinute() == o2.getMinute()) 
                return o1.getSecond() - o2.getSecond() ;
            else{
                return o1.getMinute() - o2.getMinute() ;
            }
        }
        else{
            return o1.getHour() - o2.getHour() ;
        }
    }
}

public class Sap_xep_thoi_gian {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        Time[] arr  ;  
        int n = scanner.nextInt() ; 
        arr = new Time[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = new Time() ;
            arr[i].setHour(scanner.nextInt()) ;
            arr[i].setMinute(scanner.nextInt()) ; 
            arr[i].setSecond(scanner.nextInt()) ;
        }
        Arrays.sort(arr, new TimeComparator());
        for(int i = 0 ; i < n ; i++){
             System.out.println(arr[i].getHour() + " " + arr[i].getMinute() + " " + arr[i].getSecond());
        }
        
    }
    
}
