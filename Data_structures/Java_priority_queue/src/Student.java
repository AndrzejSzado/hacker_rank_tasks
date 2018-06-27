
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return this.name+"  " + this.cgpa+"   " + this.id;
    }


    @Override
    public int compareTo(Student o) {
        if (this.getCgpa()-o.getCgpa()==0){
            if (this.getName().compareTo(o.getName())==0){
                return this.getId()-o.getId();
            }
            return this.getName().compareTo(o.getName());
        }
        return o.getCgpa()-this.getCgpa()>0?1:-1;
    }
}
