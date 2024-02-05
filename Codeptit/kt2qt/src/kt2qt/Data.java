/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2qt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Data {
   public Data() {
   }
   public List<PTGT> getData() {
      List<PTGT> list = new ArrayList();
      Oto o = new Oto("Yaris", "10/2020", 30000.0, 4, 1.5);
      o.setMa();
      list.add(o);
      o = new Oto("Vios", "05/2018", 18000.0, 4, 1.6);
      o.setMa();
      list.add(o);
      o = new Oto("Innova", "06/2020", 25000.0, 7, 1.8);
      o.setMa();
      list.add(o);
      o = new Oto("Lexus RX 450h", "06/2020", 45000.0, 7, 3.5);
      o.setMa();
      list.add(o);
      XeTai t = new XeTai("Ranger", "11/2023", 31000.0, 3.5, true);
      t.setMa();
      list.add(t);
      t = new XeTai("Suzuki Carry Truck", "05/2018", 20000.0, 5.0, false);
      t.setMa();
      list.add(t);
      t = new XeTai("Hyundai HD99", "05/2020", 12000.0, 6.5, true);
      t.setMa();
      list.add(t);
      t = new XeTai("Hyundai HD700", "05/2018", 20000.0, 7.0, false);
      t.setMa();
      list.add(t);
      return list;
   }
}
