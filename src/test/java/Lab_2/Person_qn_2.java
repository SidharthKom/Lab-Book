package Lab_2;


public class Person_qn_2 {
    String name;
    float age;

    public Person_qn_2(String name, float age) {
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

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person_qn_2 smith = new Person_qn_2("Smith", 40);
        Person_qn_2 kathy = new Person_qn_2("Kathy", 30);

        SavingsAccount smithAcc = new SavingsAccount(smith, 2000);
        CurrentAccount kathyAcc = new CurrentAccount(kathy, 3000, 1000); 

        smithAcc.deposit(2000); 
        kathyAcc.withdraw(3500); 

        System.out.println("\nUpdated Accounts:");
        System.out.println(smithAcc);
        System.out.println();
        System.out.println(kathyAcc);
    }
}

class Account_1 {
    static long nextAccNum = 3000;
    long accNum;
    double balance;
    Person_qn_2 accHolder;

    public Account_1(Person_qn_2 accHolder, double balance) {
        this.accNum = ++nextAccNum;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs" + amount + " in " + accNum);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= 500) {
            balance -= amount;
            System.out.println("Withdrew Rs" + amount + " from " + accNum);
        } else {
            System.out.println("Cannot withdraw Rs" + amount + " from " + accNum + ": Insufficient funds");
        }
    }

    
    public String toString() {
        return "Account Number: " + accNum +
                "\nBalance: ₹" + balance +
                "\nAccount Holder: " + accHolder;
    }
}

class SavingsAccount extends Account_1 {
    private final double minimumBalance = 500;

    public SavingsAccount(Person_qn_2 accHolder, double balance) {
        super(accHolder, balance);
    }

    
    public void withdraw(double amount) {
        if ((balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew Rs" + amount + " from Savings Account " + accNum);
        } else {
            System.out.println("Cannot withdraw Rs" + amount + " from Savings Account " + accNum + ": Minimum balance ₹" + minimumBalance + " required.");
        }
    }
}

class CurrentAccount extends Account_1 {
    private double overdraftLimit;

    public CurrentAccount(Person_qn_2 accHolder, double balance, double overdraftLimit) {
        super(accHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrew Rs" + amount + " from Current Account " + accNum);
        } else {
            System.out.println("Cannot withdraw Rs" + amount + " from Current Account " + accNum + ": Exceeds overdraft limit.");
        }
    }
}

