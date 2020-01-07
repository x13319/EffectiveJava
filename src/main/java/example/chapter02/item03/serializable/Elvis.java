package example.chapter02.item03.serializable;

//Serialiable singleton with public final filed
public class Elvis {
	
	private static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {
		
	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}

}
