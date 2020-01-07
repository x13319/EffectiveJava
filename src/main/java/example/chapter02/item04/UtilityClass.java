package example.chapter02.item04;

//Noninstantiable utility class
public class UtilityClass {
	
	//Supress dafault constructor for noninstantiable
	private UtilityClass(){
		throw new AssertionError();
	}

}
