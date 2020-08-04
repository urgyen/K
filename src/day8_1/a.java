package day8_1;

public class a {
	//3.3
	public static void sayHi(String name) {
		System.out.println("Hi: " + name);
	}

	//3
	public static void sayHi(int number) {

		for (int i = 0; i < number; i++) {
			System.out.println("Hi");
		}

	}

	public static void addNumber(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void addNumber(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Polymorphism;
		// 1. Method Overloading

//		sayHi(5.5);
//		System.out.println("-----");
//		sayHi(10);
		
		sayHi(500);
		sayHi("Santosh");
		
		//addNumber(10, 15);
		//addNumber(15, 15, 15);

		// 2. Method Overriding

}
