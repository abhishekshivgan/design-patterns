package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        
        CollegeStudent collegeStudent = new CollegeStudent("John", "Doe", "john@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("Jane", "Doe", "jane@gmail.com");

        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
