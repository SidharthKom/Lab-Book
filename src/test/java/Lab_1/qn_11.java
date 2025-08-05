package Lab_1;

import java.time.LocalDate;
import java.time.Period;

	 
public class qn_11 {
		String firstName;
		String lastName;
		char gender;
		LocalDate dob;
		
		qn_11(String firstName,String lastName,char gender,LocalDate dob){
		this.firstName =firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob =dob;
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
		public int calculateAge(LocalDate dob) {
			LocalDate currentDate = LocalDate.now();
			return Period.between(dob, currentDate).getYears();
		}
		public String getFullName(String firstName,String lastName) {
			return firstName+" "+lastName;
		}
		
		void display() {
			System.out.println("Personal Details: ");
			System.out.println("___________________\n");
			System.out.println("Full Name: "+ getFullName(getFirstName(),getLastName()));
			System.out.println("Age: "+ calculateAge(dob));
			System.out.println("gender: "+ getGender());
			
		}
		public static void main(String[] args) {
			LocalDate dob = LocalDate.of(2002, 05, 02);
			qn_11 obj = new qn_11("Sidharth","K",'M',dob);
			
			obj.display();
			
		}
		
		
	}
	
	 
	 
	

