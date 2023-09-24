package com.company.donot.ask.tell.lambda;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


enum CaloricLevel {
	DIET, NORMAL, FAT
};

public class StreamBasic {

	public static void main(String... args) {

		Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = Dish.menu.stream().collect(groupingBy(dish -> {
			if (dish.getCalories() <= 40)
				return CaloricLevel.DIET;
			else if (dish.getCalories() <= 70)
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		}));
		
		System.out.println(dishesByCaloricLevel);
		
		Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevel2 = 
				 Dish.menu.stream().collect(groupingBy(Dish::getCaloricLevel));
		
		 Map<com.company.donot.ask.tell.lambda.Dish.CaloricLevel, Long> dishesByCaloricLevel3 = 
				 Dish.menu.stream().collect(groupingBy(Dish::getCaloricLevel, Collectors.counting()));
		 
		 System.out.println(dishesByCaloricLevel2);
		 System.out.println(dishesByCaloricLevel3);

	}

}
