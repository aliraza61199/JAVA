package A;

import java.util.Scanner;

public class Productgulam {
	static Scanner sc;

	public static void main(String[] args) {
		m();
	
	}
	
	public static void m() {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("Select the product");

		System.out.println("press 1 for phone");
		System.out.println("press 2 for Accessories");
		System.out.println("press 3 for cereals");
		System.out.println("press 4 for Leptop");

		System.out.println("enter the number");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Phone");
			productCode();
			break;
		case 2:
			System.out.println("Accessories");
			break;
		case 3:
			System.out.println("cereals");
			break;
		case 4:
			System.out.println("Leptop");
			break;
		default:
			System.out.println("please enter correct number");
			System.out.println("enter the number");
			int g = sc.nextInt();
			m();
		}

	}

	public static void productCode() {

		System.out.println("select the Phone");
		System.out.println("press 1 for Realme");
		System.out.println("press 2 for Mi");
		System.out.println("press 3 for Iphone");
		System.out.println("press 4 for Nokia");
		System.out.println("enter the number");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Realme");
			Model();
			break;

		case 2:System.out.println("Mi");
			break;
		case 3:System.out.println("Iphone");
			break;
		case 4:
			System.out.println("Nokia");
			break;
		default:
			System.out.println("please enter correct number");
		}

	}

	public static void Model() {
		System.out.println("select the Model");
		System.out.println("press 1 for Realme C53s");
		System.out.println("press 2 for Realme 9i "+"8Gb+128GB");
		System.out.println("press 3 for Realme C55");
		System.out.println("press 4 for Realme 11 Pro 5g");
		System.out.println("enter the number");
		int price = sc.nextInt();
		switch (price) {
		case  1:System.out.println("10,999");
		break;
		case 2:System.out.println("13,499");
		break;
		case 3:System.out.println("11,999");
		break;
		case 4:System.out.println("16,999");
		break;
		
		default:
			System.out.println("please enter correct number");

		}
	}

}
