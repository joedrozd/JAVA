package Garage;

import java.util.List;


public class twentyOneSavage {

	

	

	private static void generate() {
		Car.genList();
		Motorbike.genList();
		Van.genList();
		List<String> pullUp = Vehicle.register; 
		for (String i: pullUp) {
			  System.out.println(i);
			}
	}

	private static void remove() {
		Car.delList();
		Motorbike.delList();
		Van.delList();
		List<String> pullUp = Vehicle.register; 
		for (String i: pullUp) {
			  System.out.println(i);
			}
		System.out.println("EMPTEH");
	}
	
	
	
	public static void main(String[] args) {
		generate();
		remove();
		Car.billCalculate();
		Van.billCalculate();
		Motorbike.billCalculate();
	}
}
