package desing.pattern.creational.factory.chair;

public abstract class BaseChair {
	
	private final int height;
    private final int weight;
    private final String brand;
    private final String color;
    
	public BaseChair(int Height, int weight, String brand, String color) {
		this.height = Height;
		this.weight = weight;
		this.brand = brand;
		this.color = color;
	}

	public int getHeight() {
		return height;
	}


	public int getWeight() {
		return weight;
	}


	public String getBrand() {
		return brand;
	}


	public String getColor() {
		return color;
	}

	public double getArea(){
        return (getHeight() * getHeight());

    }
    public double getVolume() {
        return getArea() * getWeight();
    }
	
	public abstract String printInfo();
	
	
}
