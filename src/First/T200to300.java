package First;

public class T200to300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 100; i >= 1; i--) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 2) {
				System.out.println(i + " is prime number");
			}
		}

	}
}
