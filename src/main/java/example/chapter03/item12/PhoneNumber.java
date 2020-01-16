package example.chapter03.item12;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber implements Comparable<PhoneNumber>{
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;
	
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		// TODO Auto-generated constructor stub
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "lineNumber");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}
	
	private static void rangeCheck(int arg,int max,String name) {
		if(arg < 0 || arg > max) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o == this) {
			return true;
		}
		if(!(o instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber pn = (PhoneNumber) o;
		return pn.areaCode == areaCode && pn.lineNumber == lineNumber 
				&& pn.prefix == prefix;
	}
	
	//normal
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		int result = 17;
//		result = 31 * result + areaCode;
//		result = 31 * result + lineNumber;
//		result = 31 * result + prefix;
//		return result;
//	}
	
	private volatile int hashCode;
	//lazy init
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = hashCode;
		if(result == 0) {
			result = 17;
			result = 31 * result + areaCode;
			result = 31 * result + lineNumber;
			result = 31 * result + prefix;
			hashCode = result;
		}
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<PhoneNumber, String> map = new HashMap<PhoneNumber, String>();
		map.put(new PhoneNumber(123, 221, 345), "xxx");
		System.out.println(map);
	}

	public int compareTo(PhoneNumber pn) {
		// TODO Auto-generated method stub
		int areaCodeDiff = areaCode - pn.areaCode;
		if(areaCodeDiff != 0) {
			return areaCodeDiff;
		}
		int prefixDiff = prefix - pn.prefix;
		if(prefixDiff != 0) {
			return prefixDiff;
		}
		return lineNumber - pn.lineNumber;
	}

}
