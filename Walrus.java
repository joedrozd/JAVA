package Jimmy;

public class Walrus {

	public static void main(String[] args) {
		int a = 100;
		if (a >= 200) {
			System.out.println("Achieved Goal!");
		} else {
			while (a < 200) {
				a++;
				System.out.println(a + " Charging!");
				if (a >= 200) {
					System.out.println("Achieved Goal!");
				}
			}
		}
	}

}
