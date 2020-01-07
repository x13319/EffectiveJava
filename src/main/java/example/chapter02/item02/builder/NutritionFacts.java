package example.chapter02.item02.builder;

public class NutritionFacts {
	private int servingSize = -1;
	private int serving = -1;
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;
	
	public static class Builder{
		//Required parameters
		private int servingSize = -1;
		private int serving = -1;
		
		//Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize,int serving) {
			// TODO Auto-generated constructor stub
			this.servingSize = servingSize;
			this.serving = serving;
		}
		public Builder calories(int val) {
			calories = val;return this;
		}
		public Builder fat(int val) {
			fat = val;return this;
		}
		public Builder sodium(int val) {
			sodium = val;return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	public NutritionFacts(Builder builder) {
		// TODO Auto-generated constructor stub
		servingSize = builder.servingSize;
		serving = builder.serving;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(45, 45)
				.calories(1).carbohydrate(2).fat(3).sodium(4).build();
		
	}

}
