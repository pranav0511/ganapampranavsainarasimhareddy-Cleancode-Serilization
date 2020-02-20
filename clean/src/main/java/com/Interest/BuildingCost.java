package com.Interest;

public class BuildingCost {
	public int buildCost(String s,int area) {
	int k=1;
	if(s.equalsIgnoreCase("standard")) {
		k=1200;
	}
	if(s.equalsIgnoreCase("above standard")) {
		k=1500;
	}
	if(s.equalsIgnoreCase("high standard")) {
		k=1800;
	} 
	if(s.equalsIgnoreCase("high standard and automated")) {
		k=2500;
	}
	return k*area;
}

}
