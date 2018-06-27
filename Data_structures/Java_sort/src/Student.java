public class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if (o.cgpa==this.cgpa){
            return this.fname.compareTo(o.fname)==0 ? o.id-this.id : this.fname.compareTo(o.fname);
        }
        return o.cgpa-this.cgpa>0?1:-1;
    }
}
