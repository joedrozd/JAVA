package ObjectOriented;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.flies();
	}
	public static class Animal{
		
		int age;
		String name;
		double weight;
		public void moves() {
			
		}
		public void swims() {
			
		}
		public void eats() {
			
		}
	}
	public static class Bird extends Animal implements fliesFast{
		public void flies() {
			
		}
	}
	public static class Fish extends Animal implements UsesGills{
		public void gills() {
			
		}
	}
	public static class Dog extends Animal{
	
	}
	public static class Cat extends Animal{
	
	}
	public static class Salmon extends Animal{
	
	}
}
