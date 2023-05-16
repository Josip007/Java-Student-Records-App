import java.util.ArrayList;
import java.util.Scanner;

public class Evidencija {
    private ArrayList<Student> studenti;
    public Evidencija() {
        this.studenti = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        studenti.add(student);
    }

    public Student searchStudent(String indexNumber) {
        for(Student student : studenti) {
            if(student.getIndexNumber().equals(indexNumber)) {
                return student;
            }
        }
        return null;
    }

    public void allStudents() {
        for(Student student: studenti) {
            System.out.println(student);
        }
    }

}
