package Garage;

public class Van extends Vehicle {

	public Van(int cost, String type, int repairCost) {
		super(cost, type, repairCost);
		// TODO Auto-generated constructor stub
	}

	static Van Amazon = new Van(20000, "Fast - Amazon", 2000);
	static Van RoyalMail = new Van(10000, "Moderate - RoyalMail", 750);
	static Van Hermes = new Van(5000, "Slow - Hermes", 300);

	static String V1 = Amazon.toString();
	static String V2 = RoyalMail.toString();
	static String V3 = Hermes.toString();
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
		int repairCostTotal = Amazon.getRepairCost() + RoyalMail.getRepairCost() + Hermes.getRepairCost();
		System.out.println("Van repair cost: " + repairCostTotal);
	}
}
