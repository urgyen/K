package topic4;

public class ok {
	public static void main(String[] args) {

		int number = 2;
		int flag;

		if (number > 0) {
			flag = 1;

		} else if (number < 0) {
			flag = 2;
		} else {
			flag = 3;
		}

		switch (flag) {
		case 1:
			System.out.println("The number is positive." +number);
			break;

		case 2:
			System.out.println("The number is negative." +number);
			break;

		case 3:
			System.out.println("The number is zero." +number);
			break;
		}
	}
}