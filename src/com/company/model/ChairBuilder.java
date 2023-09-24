package com.company.model;


public class ChairBuilder {

	private int height;
	private int weight;
	private String brand;
	private String color;

	public ChairBuilder() {

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

	public String printInfo() {
		return ("Brand: " + getBrand() + " Color: " + getColor() + " Height: " + getHeight() + "");
	}

	public  Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private ChairBuilder chair;

		private Builder() {

		}

		public Builder setHeight(int height) {
			this.chair.height = height;
			return this;
		}

		public Builder setWeight(int weight) {
			this.chair.weight = weight;
			return this;
		}

		public Builder setBrand(String brand) {
			this.chair.brand = brand;
			return this;
		}

		public Builder setColor(String color) {
			this.chair.color = color;
			return this;
		}

		public ChairBuilder build() {
			return this.chair;
		}

	}

}
