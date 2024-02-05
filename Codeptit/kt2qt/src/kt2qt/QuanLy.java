/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2qt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLy {
    private List<PTGT> list = new ArrayList<>(); 

    public QuanLy() {
    }

    public List<PTGT> getList() {
        return list;
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }
    
    public void Out(){
        for(PTGT x : list){
            System.out.println(x);
        }
    }
    
    public void timXeTaiTheoNam(int nam, boolean thung){
        List<XeTai> ltai = new ArrayList<>() ;
        Boolean res = false ;
        for(PTGT x : list){
            if(x instanceof XeTai){
                ltai.add((XeTai)x) ;
            }
        }
        for(XeTai a : ltai){
            String[] arr = a.getNgayLanBanh().split("/");
            if(Integer.parseInt(arr[1]) == nam && a.isThung() == thung){
                res = true ;
                System.out.println(a);
            }
        }
        if(res == false){
            System.out.println("khong co");
        }
    }
    
    public void sapxepOto(){
        List<Oto> loto = new ArrayList<>() ;
        Boolean res = false ;
        for(PTGT x : list){
            if(x instanceof Oto){
                loto.add((Oto)x) ;
            }
        }
        loto.sort(new Comparator<Oto>(){
            @Override
            public int compare(Oto o1, Oto o2) {
                if(o1.getNgayLanBanh().equalsIgnoreCase(o2.getNgayLanBanh())){
                    return Double.compare(o1.getGiaBan(), o2.getGiaBan()) ;
                }
                String[] arr1 = o1.getNgayLanBanh().split("/");
                String[] arr2 = o2.getNgayLanBanh().split("/") ;
                int t1 = Integer.valueOf(arr1[0]) ;
                int t2 = Integer.valueOf(arr2[0]) ;
                int n1 = Integer.valueOf(arr1[1]) ;
                int n2 = Integer.valueOf(arr2[1]) ;
                if(n2 == n1){
                    return Integer.compare(t1, t2) ;
                }
                return Integer.compare(n1, n2) ;
            }
        });
        for(Oto a : loto){
            System.out.println(a);
        }
    }
    
    public void thongkeXeTai(Boolean thung){
        List<XeTai> ltai = new ArrayList<>() ;
        Boolean res = false ;
        for(PTGT x : list){
            if(x instanceof XeTai){
                XeTai a = (XeTai) x ;
                if(a.isThung() == thung){
                    ltai.add(a) ;
                }
            }
        }
        Map<String, Long> mp = ltai.stream().collect(Collectors.groupingBy(XeTai::getNam, Collectors.counting()));
        Iterator<String> it = mp.keySet().iterator() ;
        while(it.hasNext()){
            String s = it.next() ;
            System.out.println(s + ":" + mp.get(s));
        }
    }
}
