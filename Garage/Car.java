package Garage;

public class Car extends Vehicle {

	public Car(int cost, String type, int repairCost) {
		super(cost, type, repairCost);
		// TODO Auto-generated constructor stub
	}

	static Car Porsche = new Car(20000, "Fast - Porsche", 2000);
	static Car Vauxhall = new Car(10000, "Moderate - Vauxhall", 750);
	static Car Reliant = new Car(5000, "Slow - Reliant", 300);
	
	static String V1 = Vauxhall.toString();
	static String V2 = Porsche.toString();
	static String V3 = Reliant.toString();
	public static void genList() {
		
		register.add(V1);
		register.add(V2);
		register.add(V3);
	}
	public static void delList() {
		register.remove(V1);
		register.remove(V2);
		register.remove(V3);
	}
	
	public static void billCalculate() {
		int repairCostTotal = Reliant.getRepairCost() + Porsche.getRepairCost() + Vauxhall.getRepairCost();
		System.out.println("Car repair cost: " + repairCostTotal);
	}
}
