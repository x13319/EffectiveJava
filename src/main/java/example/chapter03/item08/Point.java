package example.chapter03.item08;

public class Point {

	private final int x;
	private final int y;
	
	public Point(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31*x+y;
	}
}
