package com.company.donot.ask.tell.lambda;

import java.util.*;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	public enum CaloricLevel {
		DIET, NORMAL, FAT
	};

	@Override
	public String toString() {
		return name;
	}

	public CaloricLevel getCaloricLevel() {
		if (this.getCalories() <= 40)
			return CaloricLevel.DIET;
		else if (this.getCalories() <= 70)
			return CaloricLevel.NORMAL;
		else
			return CaloricLevel.FAT;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH),
			new Dish("salmon cocido", false, 60, Dish.Type.FISH), 
			new Dish("chicken", false, 70, Dish.Type.OTHER),
			new Dish("greek yogurt", true, 40, Dish.Type.OTHER),
			new Dish("Vegetable soup", true, 40, Dish.Type.OTHER)
			);
	
}