/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import model.PrintGeneric;
import model.SinhVien;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("To an An");
//        list.add("Ha thu Van");
//        list.add(0, "le anh Tuan");
//
//        String tt = list.get(0);
//
//        System.out.println(list);
//        System.out.println(list.size());

//        System.out.println("dung Iterator");
//        Iterator i=list.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        System.out.println("dung index");
//        int k=0;
//        while(k<list.size()){
//            System.out.println(list.get(k));
//            k++;
//        }
//        for (String k : list) {
//             System.out.println(k);
//        }
//        list.forEach(k ->System.out.println(k));
//        List<SinhVien> sv=new ArrayList<>();
//        sv.add(new SinhVien("bbb", "hhhh", 18));
//        List<Integer> so;
//         PrintGeneric p=new PrintGeneric();
//         String[] a={"To an an","Ha thuy","Tran van"};
//         Integer[] b={56,6,456,6};
//         p.printArray(a);
//         p.printArray(b);
//           Set<Integer> s=new HashSet<>();
//           s.add(123);
//           s.add(123);
//           s.add(56);
//           s.add(56);
//           Iterator t=s.iterator();
//           while(t.hasNext()){
//               System.out.println(t.next());
//           }
//           System.out.println(s);
//             Map<String,String> m=new HashMap<>();
//             m.put("mot", "To an an");
//             m.put("hai", "Lai thu");
//             m.put("mot", "Vu huu");
//             m.put("ba", "Minh ha");
//             m.put("bon", "Cao tuan");
//             Iterator i=m.keySet().iterator();
//             while(i.hasNext()){
//                 Object key=i.next();
//                 System.out.println(key+":"+m.get(key));
//             }
                //List-array
                List<String> l=new ArrayList<>();
                l.add("to an an");
                l.add("Thu ha");
                l.add("Dang tuan");
                System.out.println(l);
                System.out.println("-------------------");
                String[] a=l.toArray(new String[l.size()]);
                System.out.println(Arrays.toString(a));
                List<String> b=Arrays.asList(a);
                System.out.println("-----------------");
                System.out.println(b);
    }
}
