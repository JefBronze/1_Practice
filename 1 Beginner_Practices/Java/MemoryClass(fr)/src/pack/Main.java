package pack;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		MyClass a1 = new MyClass("Jean");
		MyClass a2 = new MyClass("Marie");
		MyClass a3 = new MyClass("Pierre");
		MyClass a4 = new MyClass("Anne");
		
		System.out.println(Arrays.toString(MyClass.getMemory().toArray()));
		System.out.println(MyClass.getMemory().get(1));
		System.out.println(MyClass.getMemory().get(0));
		
		MyClass.removeFromMemory(a3);
		System.out.println(Arrays.toString(MyClass.getMemory().toArray()));
		
	}

}
