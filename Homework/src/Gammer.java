
public class Gammer {
    
    private String firstName;
    private String lastName;
    private String id;
    private String yearOfbirth;

    public Gammer(String firstName, String lastName, String id, String yearOfbirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearOfbirth = yearOfbirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYearOfbirth() {
        return yearOfbirth;
    }

    public void setYearOfbirth(String yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }
    
    
    
}
