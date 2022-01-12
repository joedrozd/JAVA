package Garage;

public class Motorbike extends Vehicle {

	public Motorbike(int cost, String type, int repairCost) {
		super(cost, type, repairCost);
		// TODO Auto-generated constructor stub
	}

	static Motorbike Lowrider = new Motorbike(20000, "Fast- Lowrider", 2000);
	static Motorbike Suzuki = new Motorbike(10000, "Moderate - Suzuki", 750);
	static Motorbike Chinese = new Motorbike(5000, "Slow - Chinese", 300);

	static String V1 = Lowrider.toString();
	static String V2 = Suzuki.toString();
	static String V3 = Chinese.toString();
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
		int repairCostTotal = Lowrider.getRepairCost() + Suzuki.getRepairCost() + Chinese.getRepairCost();
		System.out.println("Motorbike repair cost: " + repairCostTotal);
	}
}

