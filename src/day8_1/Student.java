package day8_1;

public class Student {

	// 1. HAmi data safe; private

//variable
	private String name;
	private int age;

	// 2. getter and Setters;

	public int getAge() {
		//Logger;
		return age;
	}

	public void setAge(int age) {

		//Logger ;
		//old date
		//Date
		//changed by who?
		
		if (age > 0 || age < 100) {
			this.age = age;
		} else {
			System.out.println("Wrong Data");
		}
		
	}

	// argument
	public void setName(String name) {
		
		//db -- < students ko name
		
		//if(db ma bhako namee ho bhane matra) {
		this.name = name;
		//}
		//else {
		//	System.out.println("Not a student of this school");
		//}
	}

	public String getName() {
		return name;
	}

	
	
	
//	
//	Apple@123
//	//no of char >8
//	//every char if Capital true
//	//every char if Symbol true
//	//if number 1 true;
//	
//	this.password= password;
//	
//	else {
//		"REquirements are not sufficient"
//	}
	
	
	
}
