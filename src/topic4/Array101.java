package topic4;

public class Array101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array

		int arr[] = new int[6];
		// indexing for Array?

		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;
		arr[5] = 25;
		arr[6] = 19;

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

		// System.out.println(arr.length);

		System.out.println("---");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int dataFromArray : arr) {
			System.out.println(dataFromArray);
		}

	}
	
	
	

}
