package desing.pattern.creational.factory.chair;

public class RockChair extends BaseChair {
	
	public RockChair(int hight, int weight, String brand, String color) {
		super(hight, weight, brand, color);
	}

	@Override
	public String printInfo() {
		return ("Brand: " +super.getBrand() + " Color: "+  super.getColor() +  " Height: " +super.getHeight() + " Weight: "+ super.getWeight());
		
	}


	

}
