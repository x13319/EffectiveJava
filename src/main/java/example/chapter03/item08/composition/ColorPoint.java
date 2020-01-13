package example.chapter03.item08.composition;

public class ColorPoint {
	private Point point;
	private Color color;
	
	public ColorPoint(int x, int y, Color color) {
		// TODO Auto-generated constructor stub
		point = new Point(x, y);
		this.color = color;
	}
	
	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof ColorPoint)) {
			return false;
		}
		
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color.equals(color);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return point.hashCode() * 31 + color.hashCode();
	}

}
