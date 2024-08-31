package domain;

import lombok.Data;


//학습용 - 지워질 것
@Data
public class MyClass {
	private int value;
	private String name;
	

	
	
}
public class Main{
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.setValue(10);
		obj.setName("Example");
		System.out.println(obj.toString());
	}
}

