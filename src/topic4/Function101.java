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
	public static String addNumber(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

		return "Hello";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// function ra method

		String dataFromMethod = addNumber(100, 200);

		System.out.println(dataFromMethod);

	}

	//function bhaneko 4 ota??
	//return type 
	//arguments
	
	//	1. Function with arguments and no return type;
	//	2. Function with arguments and return type;	
	//	3. function without arguments and no return type;
	//	4. Function without arguments and return;
	
	
}
