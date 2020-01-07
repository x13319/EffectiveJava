package example.chapter02.item03.enumoration;
//Enum singleton - the perfected approach
public enum Elvis {
	INSTANCE;
	
	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}

}
