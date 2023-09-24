package com.company.donot.repeat.your.self;

import java.util.ArrayList;
import java.util.List;

import desing.pattern.creational.factory.chair.BaseChair;
import desing.pattern.creational.factory.chair.ChairFactory;
import desing.pattern.creational.factory.chair.ModernChair;
import desing.pattern.creational.factory.chair.RockChair;

public class TestDRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChairFactory chairFactory = new ChairFactory();
		
		List<RockChair> rockChairs = new ArrayList<>();
		rockChairs.add(new RockChair(50,50,"Rock Brand", "Black/gray Color"));
		
		List<ModernChair> modernChairs = new ArrayList<>();
		
		modernChairs.add(new ModernChair(100,150,"Modern Brand", "Modern Color"));
		
		
		Company company = new Company(rockChairs, modernChairs);
		company.printModernChairs();
		company.printRockChairs();
		
		
		List<BaseChair> baseChairs = new ArrayList<>();
		
		baseChairs.add(chairFactory.getChair("CLASICA"));
		
		company.printChair(baseChairs);
		
		System.out.println("");
		System.out.println("GENERIC");
		System.out.println("");
		
		// generic
		company.printInfo(rockChairs);
		company.printInfo(modernChairs);

	}

}
