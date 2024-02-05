/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import model.GiaoDich;

/**
 *
 * @author ADMIN
 */
public class MainGeneric {
    public static void main(String[] args) {
//        Integer[] a={4,5,6,7};
//        String[] b={"ha noi","Thai binh","Nam dinh"};
//        Chung c=new Chung();
//        c.printArray(a);
//        c.printArray(b);
//          Set<String> s1=new LinkedHashSet<>();
//          s1.add("mot");
//          s1.add("moT");
//          s1.add("hai");
//          s1.add("ba");
//          s1.add("bon");
//          System.out.println(s1);
//          System.out.println("--------------------");
//          Set<String> s2=new HashSet<>();
//          s2.add("mot");
//           s2.add("mot");
//          s2.add("hai");
//          s2.add("ba");
//          s2.add("bon");
//          System.out.println(s2);
//          System.out.println("---------------------");
//          Set<String> s3=new TreeSet<>();
//          s3.add("mot");
//           s3.add("mot");
//            s3.add("mot");
//          s3.add("hai");
//          s3.add("ba");
//          s3.add("bon");
//          System.out.println(s3);
//          Iterator<String> i=s3.iterator();
//          while(i.hasNext()){
//              System.out.println(i.next());
//          }
//            int[] a={4,6,4,5,6,7,4};
//            //4:3  5:1 6:2
//            Set<Integer> s=new TreeSet<>();
//            for(int k:a){
//                s.add(k);
//            }
//            for (Integer i:s) {
//                int c=0;
//                for (int j = 0; j < a.length; j++) {
//                    if(a[j]==i){
//                        c++;
//                    }
//                }
//                System.out.println(i+":"+c);
//        }
//          Map<Integer,GiaoDich> m=new TreeMap<>();
//          Iterator<Integer> i=m.keySet().iterator();
//          while(i.hasNext()){
//              Integer k=i.next();
//              System.out.println(k+":"+m.get(k));
//          }
             //doi List - array
             List<String> a=new ArrayList<>();
             a.add("An");
             a.add("Bao");
             a.add("lan");
             a.add("trung");
             System.out.println(a);
             String[] b=a.toArray(new String[a.size()]);
             System.out.println(Arrays.toString(b));
             //array - List
             List<String> c=Arrays.asList(b);
             System.out.println(c);
             
    }
}
