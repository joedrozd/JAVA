package ObjectOriented;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class personList extends Person{
	 public personList(String name, String job, int age) {
		super(name, job, age);
	}
	 static Person Joe = new Person("Joel", "Dev", 27);
	 static Person Joe2 = new Person("Joen", "Dev2", 27);
	 static Person Joe3 = new Person("Joem", "Dev3", 27);
		
	public static List<String> register = new ArrayList<>(); 
	public static void generate() {
		String Person1 = Joe.toString();
		register.add(Person1);
		String Person2 = Joe2.toString();
		register.add(Person2);
		String Person3 = Joe3.toString();
		register.add(Person3);
	}
	public static void getText() {
		Boolean check = Arrays.asList(register).contains("Joel");
		if (check = true) {
		System.out.println(Joe);
		} else {
			System.out.println("Doesn't contain");
		}
	}

	public static void main(String[] args) {
		generate();
		System.out.println(register);
		getText();
	}
}
