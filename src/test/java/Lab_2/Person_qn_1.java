package Lab_2;

public class Person_qn_1 {
	String name;
	float age;
	
	public Person_qn_1(String name,float age) {
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
		Person_qn_1 smith = new Person_qn_1("Smith",40);
		Person_qn_1 kathy = new Person_qn_1("Kathy",30);
		
		Account smithAcc = new Account(smith,2000);
		Account kathyAcc = new Account(kathy,3000);
		
		smithAcc.deposit(2000);
		kathyAcc.withdraw(2000);
		System.out.println();
		System.out.println("Updated acc:");
		System.out.println(smithAcc);
		System.out.println();
		System.out.println(kathyAcc);
	}

}
class Account{
	static long nextAccNum = 3000;
	long accNum;
	double balance;
	Person_qn_1 accHolder;
	
	public Account(Person_qn_1 accHolder, double balance) {
		this.accNum = ++nextAccNum;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+= amount;
			System.out.println("Deposited Rs"+ amount + " in " + accNum);
		}
		else
			System.out.println("Invalid");
	}
	public void withdraw(double amount) {
		if((balance - amount)>=500) {
			balance -= amount;
			System.out.println("Withdrew"+ amount+ " from "+ accNum);
			
		}
		else
			System.out.println("Cant withdraw");
	}

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



