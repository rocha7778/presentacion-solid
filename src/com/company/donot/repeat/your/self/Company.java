package com.company.donot.repeat.your.self;

import java.util.ArrayList;
import java.util.List;

import desing.pattern.creational.factory.chair.BaseChair;
import desing.pattern.creational.factory.chair.ModernChair;
import desing.pattern.creational.factory.chair.RockChair;

public class Company {

	private List<RockChair> rockChairs = new ArrayList<>();
	private List<ModernChair> modernChairs = new ArrayList<>();

	public Company(List<RockChair> rockChairs, List<ModernChair> modernChairs) {
		this.rockChairs = rockChairs;
		this.modernChairs = modernChairs;

	}

	public void printRockChairs() {
		for (RockChair rockChair : rockChairs) {
			System.out.println(rockChair.printInfo());
		}
	}
	
	public void printModernChairs() {
		for (ModernChair rockChair : modernChairs) {
			System.out.println(rockChair.printInfo());
		}
	}
	
	public void printChair(List<BaseChair> chairs) {
		for (BaseChair chair : chairs) {
			System.out.println(chair.printInfo());
		}
	}
	
	public <T> void printInfo(List<? extends BaseChair> chairs) {
		
		for (BaseChair chair : chairs) {
			System.out.println(chair.printInfo());
		}
		
	}

}
