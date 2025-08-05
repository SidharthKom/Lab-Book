package Lab_1;
 
public class Person_qn6 {
		String firstName;
		String lastName;
		char gender;
		
Person_qn6(String firstName,String lastName,char gender){
		this.firstName =firstName;
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
			System.out.println("First Name: "+ getFirstName());
			System.out.println("Last Name: "+ getLastName());
			System.out.println("gender: "+ getGender());
			
		}
		public static void main(String[] args) {
			Person_qn6 obj = new Person_qn6("Sidharth","K",'M');
			obj.display();
			
		}
		
		
	}
	
	 
	 
	

