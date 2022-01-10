package ObjectOriented;

public class Person {


	private int age;
	private String name;
	private String job;
	
	// Constructor
	public Person(String name, String job, int age) {

	        this.name = name;
	        this.job = job;
	        this.age = age;
	    }

	@Override
	public String toString() { 
		return "Name: '" + name + "' Job: '" + job + "' Age: '" + age + "|";
	} 
	public void printPerson() {
		System.out.println("My name is: "+ this.name + " My age is: " + this.age + " My job is: " + this.job);
	
	}
}



