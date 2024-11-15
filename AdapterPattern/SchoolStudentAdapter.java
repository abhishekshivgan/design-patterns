package AdapterPattern;

public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getFirstName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getLastName() {
        return schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }
    
}
