package Lab_1;
// Qn 7
	 
public class Person_qn7 {
		String firstName;
		String lastName;
		char gender;
		String Phoneno;
		
		Person_qn7(String firstName,String lastName,char gender,String Phoneno){
			this.firstName =firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.Phoneno = Phoneno;
			
		}
		
		public String getPhoneno() {
			return Phoneno;
		}

		public void setPhoneno(String phoneno) {
			Phoneno = phoneno;
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
			System.out.println("Phoneno: "+getPhoneno());
			
		}
		public static void main(String[] args) {
			Person_qn7 obj = new Person_qn7("Sidharth","K",'M',"9123456789");
			obj.display();
			
		}
		
		
	}
	
	 
	 
	

