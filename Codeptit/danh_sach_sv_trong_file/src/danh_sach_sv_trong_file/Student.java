package danh_sach_sv_trong_file;

class Student implements Comparable<Student> {

    private String msv, name, lop, email;

    public Student(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        normalize();
    }

    public String getMsv() {
        return msv;
    }

    private void normalize() {
        String res = "";
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++) {
            res += list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
            if (i != list.length - 1) {
                res += " ";
            }
        }
        name = res;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

    @Override
    public int compareTo(Student o) {
        return msv.compareTo(o.getMsv());
    }
}
