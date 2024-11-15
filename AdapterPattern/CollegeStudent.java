package AdapterPattern;

public class CollegeStudent implements Student {
    private String firstName;
    private String lastName;
    private String email;

    public CollegeStudent(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public String getEmail() {
        return email;
    }

    
}
