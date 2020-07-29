package day6;

public class Person {
	
	//state
	String name;
	char gender;
	double age;
	String address;
	
	
	//behaviours
	
	public void printDetails() {
		System.out.println("Name: " +name );
		System.out.println("Gender: " +gender );
		System.out.println("Age: " +age );
		System.out.println("Address: " +address );

	}
	
	public void eatsFood() {
		
		if(age>20) {
			System.out.println("Eats Dal bhat");
		}
		else {
			System.out.println("WaiWai");
		}
	}
	
	public void sleeps() {
		System.out.println("Sleeps");
	}
	
	
}
