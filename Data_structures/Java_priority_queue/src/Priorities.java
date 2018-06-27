import java.util.*;

public class Priorities {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(List<String> events) {
        for (String event: events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")){
                String name = parts[1];
                String cgpa = parts[2];
                String id = parts[3];
                Student student = new Student(Integer.parseInt(id),name,Double.parseDouble(cgpa));
                students.add(student);
            }
            if (parts[0].equals("SERVED")){
                Collections.sort(students);
                if (!students.isEmpty())students.remove(0);
            }
        }
        return students;
    }
}
