package example.chapter02.item03.method;

//Singleton with static factory
public class Elvis {

	private static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {
		
	}
	
	public static Elvis getInstance() {
		return INSTANCE;
	}
	
	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elvis elvis = Elvis.getInstance();
		elvis.leaveTheBuilding();
	}

}
