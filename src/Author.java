
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;

        switch (gender) {
            case MALE -> this.gender = 'm';
            case FEMALE -> this.gender = 'f';
            case UNKNOWN -> this.gender = 'u';
            default -> throw new IllegalStateException("Unexpected value: " + gender);
        }

    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return  name + "(" + gender + ") at " + email;
    }
}
