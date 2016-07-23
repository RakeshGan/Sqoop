import java.util.Date;

class Test5 {
	int x;
	String name;

	Test5() {
		x = 10;
		name = "visitor";
	}

	Test5(int x, String sName) {
		this.x = x;// get the value of local x,and assign it to instance x
		name = sName;
	}

	public void show() {
		System.out.println(x);
		System.out.println(name);
	}

	public void show(String userId) {
		System.out.println("Hello " + userId);
		System.out.println(x);
		System.out.println(name);
	}

}

class Test5Child extends Test5 {
	int x;
	int roll;
	String address;

	Test5Child() {
		roll = 10;
		address = "Hyd";
		x = 50;
		super.x = 60;
		name = "Rakesh";
	}

	@Override
	public void show() {
		System.out.println("x =" + x);
		System.out.println("super x=" + super.x);
		System.out.println("Name =" + name);
		System.out.println("roll =" + roll);
		System.out.println("Address =" + address);
	}

	public void show(String userId) {
		System.out.println("No logic show()");
		super.show(userId);
	}

}

public class _5ConstructorNMethodOverriding {
	public static void main(String[] args) {

		/*
		 * Test5 t5=new Test5(); //please uncomment and run while commenting al
		 * others t5.show();
		 */

		/*
		 * Test5 t6 = new Test5(20, "Suraj"); t6.show();
		 */

		Test5Child t7 = new Test5Child();
		t7.show();
		t7.show("1001");

	}

}
