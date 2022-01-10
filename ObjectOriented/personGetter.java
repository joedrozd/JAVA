package ObjectOriented;

public class personGetter extends Person{

	 
    public personGetter(String name, String job, int age) {
		super(name, job, age);
		
	}

	public static void main(String[] args) {
    	Person Joe = new Person("Joe", "Dev", 27);
    	Joe.printPerson();
    }

}
