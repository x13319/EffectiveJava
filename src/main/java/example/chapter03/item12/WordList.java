package example.chapter03.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new TreeSet<String>();
		Collections.addAll(s, args);
		System.out.println(s);
	}

}
