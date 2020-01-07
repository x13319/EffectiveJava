package example.chapter02.item02.javabeans;

public class NutritionFacts {
	private int servingSize = -1;
	private int serving = -1;
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;
	
	public NutritionFacts() {
		// TODO Auto-generated constructor stub
	}
	
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServing(int serving) {
		this.serving = serving;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts nutritionFacts = new NutritionFacts();
		nutritionFacts.setCalories(1);
		nutritionFacts.setCarbohydrate(1);
		nutritionFacts.setFat(1);
		nutritionFacts.setServing(1);
		nutritionFacts.setServingSize(1);
		nutritionFacts.setSodium(1);
	}

}
