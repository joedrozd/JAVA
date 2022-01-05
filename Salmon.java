package Jimmy;

public class Salmon {
	private static int physics = 150;
	private static int biology = 123;
	private static int chemistry = 32;
	private static int total = 450;
	private static int totalSingle = 150;
	private static int percentage = 100;
	
	public static void validation() {
		if (physics > 150) {
			System.out.println("CHEATING YOU GOT MORE THAN THE EXAM");
		}
		else if (physics <= -1) {
			System.out.println("You did so bad you got negative grades!");
		}
		if (biology > 150) {
			System.out.println("CHEATING YOU GOT MORE THAN THE EXAM");
		}
		else if (biology <= -1) {
			System.out.println("You did so bad you got negative grades!");
		}
		if (chemistry > 150) {
			System.out.println("CHEATING YOU GOT MORE THAN THE EXAM");
		}
		else if (chemistry <= -1) {
			System.out.println("You did so bad you got negative grades!");
		}
	}
	
	
	
	public static void exam() {
		double num3 = physics + biology + chemistry;
		System.out.println("Your total marks are: " + num3);
		double num4 = num3 / total * percentage ;
		System.out.println("Your percentage is: " + num4);
		if (num4 >= 60) {
			System.out.println("Yay you passed! Make sure you passed each exam.");
		} else if (num4 == 100) {
			System.out.println("Top marks fella!");
			System.out.println("Oi Oi Saveloy you passed!");
		}
		else {
			System.out.println("Oh no, you failed.");
		}
	}
	public static void examSingle() {
		double num3 = physics;
		System.out.println("Your physics marks are: " + num3);
		double num4 = num3 / totalSingle * percentage ;
		System.out.println("Your percentage is: " + num4);
		if (num4 < 60) {
			System.out.println("Oh no, you failed Physics!");
		}
		else if (num4 == 100) {
			System.out.println("Top marks fella!");
			System.out.println("Oi Oi Saveloy you passed!");
		}
		 else {
				System.out.println("Oi Oi Saveloy you passed!");
			}
	}
	public static void examSingle2() {
		double num3 = chemistry;
		System.out.println("Your chemistry marks are: " + num3);
		double num4 = num3 / totalSingle * percentage ;
		System.out.println("Your percentage is: " + num4);
		if (num4 < 60) {
			System.out.println("Oh no, you failed Chemistry!");
		}
		else if (num4 == 100) {
			System.out.println("Top marks fella!");
			System.out.println("Oi Oi Saveloy you passed!");
		}
		else {
			System.out.println("Oi Oi Saveloy you passed!");
		}
	}
	
	public static void examSingle3() {
		double num3 = biology;
		System.out.println("Your biology marks are: " + num3);
		double num4 = num3 / totalSingle * percentage ;
		System.out.println("Your percentage is: " + num4);
		if (num4 < 60) {
			System.out.println("Oh no, you failed Biology!");
		}
		else if (num4 == 100) {
			System.out.println("Top marks fella!");
			System.out.println("Oi Oi Saveloy you passed!");
		}
		else {
			System.out.println("Oi Oi Saveloy you passed!");
		}
	}

	
	 public static void main(String[] args) {
		 validation();
		 System.out.println("");
		 examSingle();
		 System.out.println("");
		 examSingle2();
		 System.out.println("");
		 examSingle3();
		 System.out.println("");
		 exam();
	 }
}
