package com.Interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuildingCostTest {
BuildingCost buildingcost = new BuildingCost();
	@Test
	public void testBuildCost() {
		assertEquals(24000,buildingcost.buildCost("standard", 20));
	}
	@Test
	public void testBuildCost1() {
		assertEquals(30000,buildingcost.buildCost("above standard", 20));
	}
	@Test
	public void testBuildCost2() {
		assertEquals(36000,buildingcost.buildCost("high standard", 20));
	}
	@Test
	public void testBuildCost3() {
		assertEquals(50000,buildingcost.buildCost("high standard and automated", 20));
	}
	
}
