package topic4;

public class Function101 {

	public static void sayHi() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
		}

		//

	}

//Arguments
	// return
//	public static String addNumber(int a, int b) {
//
//		int sum = a + b;
//		System.out.println(sum);
//
//		return "Hello";
//
//	}

	// 1. Function with arguments and no return type;

	public static void sayHi(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(i + " Hi");
		}
	}

	// 2. Function with arguments and return type;

	public static int addNumber(int a, int b) {
		int sum = a + b;

		return sum;

	}

	// 3. function without arguments and no return type;

	public static void letsRest() {
		System.out.println("zzzzzz");
	}

	// 4. Function without arguments and return;

	public static String whatsYourName() {
		return "Kp Oli";
	}

	public static double valueOfPI() {
		return 3.1416;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// function ra method

//		String dataFromMethod = addNumber(100, 200);
//
//		System.out.println(dataFromMethod);
//		sayHi(25);
//		int dataFromMethod= addNumber(5, 5);  //10
//		System.out.println(dataFromMethod);

		// System.out.println(addNumber(10, 20)*100);
		//letsRest();

		//System.out.println(whatsYourName());
		
		String dataFromMethod= whatsYourName();
		System.out.println(dataFromMethod + " PM");
		
		
		
	}

	// function bhaneko 4 ota??
	// return type
	// arguments

}
