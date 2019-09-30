package collections;

public class StringBufferExample {
	
	
	
	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("Amarjeet");
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.append(" Singh"));
		System.out.println(str.capacity());
		System.out.println(str.insert(1, "MARJEET"));
		System.out.println(str.replace(1, 2, "MA"));
	}

}
