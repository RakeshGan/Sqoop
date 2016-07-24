abstract class Test3 {
	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public abstract void subtract(int x, int y);
}

abstract class Test3Child extends Test3 {
	public abstract void multiply(int x, int y);

	public void division(int x, int y) {// ctrl+shift+F
		System.out.println(x / y);
	}

}

class Test3Child2 extends Test3Child {
	public void multiply(int x, int y) {
		System.out.println(x*y);
	}
	
	public void subtract(int x, int y) {
		System.out.println(x-y);
	}
}

public class _3AbstractMethodDemo {
	public static void main(String[] args) {
		// Test3 t3=new Test3();//not allowed
		// t3.subtract(x, y);//not allowed
		
		Test3Child2 child=new Test3Child2();
		child.add(5, 10);
		child.division(10, 2);
		child.subtract(10, 5);
		child.multiply(5, 6);
	}
}
