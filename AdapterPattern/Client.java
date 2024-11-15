package AdapterPattern;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        StudentClient st = new StudentClient();
        List<Student> students = st.getStudents();
        for (Student student: students) {
            System.out.print(student.getFirstName() + " ");
            System.out.print(student.getLastName() + " ");
            System.out.print(student.getEmail() + " ");
            System.out.println();
        }
    }
}
