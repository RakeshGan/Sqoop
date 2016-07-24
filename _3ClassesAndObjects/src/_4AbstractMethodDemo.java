abstract class Test4 {
	public abstract void add(int x, int y);

	public abstract void mul(int x, int y);

	public abstract void sub(int x, int y);

	public abstract void div(int x, int y);

}

class Test4Child extends Test4 {

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void mul(int x, int y) {
		System.out.println(x * y);
	}

	public void sub(int x, int y) {
		System.out.println(x - y);
	}

	public void div(int x, int y) {
		System.out.println(x / y);
	}

}

public class _4AbstractMethodDemo extends Object{
	public static void main(String[] args) {
		// Test4 t4=new Test4();//not allowed
		// t4.subtract(x, y);//not allowed

		Test4Child child = new Test4Child();
		child.add(5, 10);
		child.div(10, 2);
		child.sub(10, 5);
		child.mul(5, 6);
		
	}
}
