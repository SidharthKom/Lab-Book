package Lab_2;

public class Person_qn_5 {
	String name;
	float age;

	public Person_qn_5(String name, float age) {
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

	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}

	public static void main(String[] args) {
		Person_qn_1 smith = new Person_qn_1("Smith", 40);
		Person_qn_1 kathy = new Person_qn_1("Kathy", 30);

		Account_2 smithAcc = new SavingsAccount_1(smith, 2000);
		Account_2 kathyAcc = new CurrentAccount_1(kathy, 3000, 1000); // overdraft: 1000

		smithAcc.deposit(2000);
		kathyAcc.withdraw(3500);

		System.out.println();
		System.out.println("Updated acc:");
		System.out.println(smithAcc);
		System.out.println();
		System.out.println(kathyAcc);
	}
}


abstract class Account_2 {
	static long nextAccNum = 3000;
	long accNum;
	double balance;
	Person_qn_1 accHolder;

	public Account_2(Person_qn_1 accHolder, double balance) {
		this.accNum = ++nextAccNum;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited Rs" + amount + " in " + accNum);
		} else {
			System.out.println("Invalid deposit");
		}
	}

	public abstract void withdraw(double amount); // now abstract

	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person_qn_1 getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person_qn_1 accHolder) {
		this.accHolder = accHolder;
	}

	public String toString() {
		return "Account Number: " + accNum +
				"\nBalance: Rs" + balance +
				"\nAccount Holder: " + accHolder;
	}
}


class SavingsAccount_1 extends Account_2 {
	final double MIN_BALANCE = 500;

	public SavingsAccount_1(Person_qn_1 accHolder, double balance) {
		super(accHolder, balance);
	}

	@Override
	public void withdraw(double amount) {
		if ((balance - amount) >= MIN_BALANCE) {
			balance -= amount;
			System.out.println("Withdrew Rs" + amount + " from Savings Account " + accNum);
		} else {
			System.out.println("Insufficient balance. Must maintain Rs" + MIN_BALANCE);
		}
	}
}


class CurrentAccount_1 extends Account_2 {
	double overdraftLimit;

	public CurrentAccount_1(Person_qn_1 accHolder, double balance, double overdraftLimit) {
		super(accHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance + overdraftLimit) {
			balance -= amount;
			System.out.println("Withdrew Rs" + amount + " from Current Account " + accNum);
		} else {
			System.out.println("Withdrawal exceeds overdraft limit.");
		}
	}
}
