package Lab_3;

public class Person_qn_2 {
    String name;
    float age;

    
    public Person_qn_2(String name, float age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    // User-defined Exception as an inner class
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            Person_qn_2 smith = new Person_qn_2("Smith", 40);
            Person_qn_2 kathy = new Person_qn_2("Kathy", 14);
            
            Account smithAcc = new Account(smith, 2000);
            Account kathyAcc = new Account(kathy, 3000);

            smithAcc.deposit(2000);
            kathyAcc.withdraw(2000);

            System.out.println();
            System.out.println("Updated Accounts:");
            System.out.println(smithAcc);
            System.out.println();
            System.out.println(kathyAcc);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Account class remains the same
class Account {
    static long nextAccNum = 3000;
    long accNum;
    double balance;
    Person_qn_2 accHolder;

    public Account(Person_qn_2 accHolder, double balance) {
        this.accNum = ++nextAccNum;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs " + amount + " in account " + accNum);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= 500) {
            balance -= amount;
            System.out.println("Withdrew Rs " + amount + " from account " + accNum);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of Rs 500 required.");
        }
    }

    public String toString() {
        return "Account Number: " + accNum +
               "\nBalance: Rs " + balance +
               "\nAccount Holder: " + accHolder;
    }
}
