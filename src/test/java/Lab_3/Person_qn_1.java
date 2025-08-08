package Lab_3;

public class Person_qn_1 {
    String firstName;
    String lastName;
    char gender;

    
    Person_qn_1(String firstName, String lastName, char gender) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty() ||
            lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("First name or Last name cannot be blank.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    void display() {
        System.out.println("Personal Details: ");
        System.out.println("___________________\n");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
    }

    
    class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }

   
    public static void main(String[] args) {
        try {
            
            Person_qn_1 obj1 = new Person_qn_1("Sidharth", "", 'M');
            obj1.display();

            System.out.println();

            
        } catch (Person_qn_1.InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
