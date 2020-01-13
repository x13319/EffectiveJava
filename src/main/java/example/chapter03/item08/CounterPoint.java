package example.chapter03.item08;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {
	private static final AtomicInteger counter = new AtomicInteger();

	public CounterPoint(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		counter.incrementAndGet();
	}
	
	public int numberCreated() {
		return counter.get();
	}

}
