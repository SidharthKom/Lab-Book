package Lab_1;
	 
public class Person_qn8 {
		String firstName;
		String lastName;
		Gendr gender;
		String Phoneno;
		enum Gendr{M,F}
		
		Person_qn8(String firstName,String lastName,Gendr gender,String Phoneno){
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

		public Gendr getGender() {
			return gender;
		}

		public void setGender(Gendr gender) {
			this.gender = gender;
		}
		
		void display() {
			System.out.println("Personal Details: ");
			System.out.println("___________________\n");
			System.out.println("First Name: "+ getFirstName());
			System.out.println("Last Name: "+ getLastName());
			System.out.println("Gender: "+ getGender());
			System.out.println("Phoneno: "+getPhoneno());
			
		}
		public static void main(String[] args) {
			Person_qn8 obj = new Person_qn8("Sidharth","K",Gendr.M,"9123456789");
			obj.display();
			
		}
		
		
	}
	
	 
	 
	

