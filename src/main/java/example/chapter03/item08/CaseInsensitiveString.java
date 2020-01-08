package example.chapter03.item08;

public class CaseInsensitiveString {
	
	private final String s;
	
	public CaseInsensitiveString(String s) {
		// TODO Auto-generated constructor stub
		if(s == null) {
			throw new NullPointerException();
		}
		this.s = s;
	}
	
	//错误版本
//	@Override
//	public boolean equals(Object o) {
//		// TODO Auto-generated method stub
//		if(o instanceof CaseInsensitiveString) {
//			return s.equalsIgnoreCase(((CaseInsensitiveString)o).s);
//		}
//		if(o instanceof String) {
//			return s.equalsIgnoreCase((String)o);
//		}
//		return false;
//	}
	
	//正确版本
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return o instanceof CaseInsensitiveString && ((CaseInsensitiveString)o).s.equalsIgnoreCase(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		CaseInsensitiveString cis2 = new CaseInsensitiveString("polish");
		String s = "polish";
		System.out.println("cis.equals(s) : "+cis.equals(s));
//		System.out.println("cis.equals(cis2) : "+cis.equals(cis2));
		System.out.println("s.equals(cis) : "+s.equals(cis));
	}

}
