package example.chapter03.item08;

public class ColorPoint extends Point{
	
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	//违反对称性
//	@Override
//	public boolean equals(Object o) {
//		// TODO Auto-generated method stub
//		if(!(o instanceof ColorPoint)) {
//			return false;
//		}
//		return super.equals(o) && ((ColorPoint)o).color == color;
//	}
	
	//违反传递性
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Point)) {
			return false;
		}
		if(!(o instanceof ColorPoint)) {
			return o.equals(this);
		}
		return super.equals(o) && ((ColorPoint)o).color == color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
