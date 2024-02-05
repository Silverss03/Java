
package danh_sach_mon_thi;

public class Subject implements Comparable<Subject>{
    private String id, name, test ;

    public Subject(String id, String name, String test) {
        this.id = id;
        this.name = name;
        this.test = test;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public int compareTo(Subject o) {
        return id.compareTo(o.getId()) ;
    }
    
    public String toString(){
        return id + " " + name + " " + test ;
    }
}
