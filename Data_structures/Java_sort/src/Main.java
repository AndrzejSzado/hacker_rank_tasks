import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.next());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = Integer.parseInt(in.next());
            String fname = in.next();
            double cgpa = Double.parseDouble(in.next());

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
