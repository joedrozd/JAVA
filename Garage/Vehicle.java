package Garage;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	private int cost;
	private String type;
	private int repairCost;
	public static List<String> register = new ArrayList<>(); 
	public Vehicle(int cost, String type, int repairCost) {
		this.setCost(cost);
		this.setType(type);
		this.setRepairCost(repairCost);
	}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(int repairCost) {
		this.repairCost = repairCost;
	}
	
	@Override
	public String toString() { 
		return "Name: '" + type + "' Cost: '" + cost + "' Repair Cost: '" + repairCost + "|";
	} 
	public void printVehicle() {
		System.out.println("");
	
	}
	

}
