package day6;

public class Student {
//state
	int id;
	String name;
	String grade;
	int year;

	// behaviour
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Grade : " + grade);
		System.out.println("year: " + year);
	}

	public void study() {
		System.out.println("PAdhneee");
	}

	public void research() {

		if (year > 2) {
			System.out.println("R and D");
		} else {
			System.out.println("Do moooz");
		}
	}

}
