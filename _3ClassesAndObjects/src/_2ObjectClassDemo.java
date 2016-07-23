class Test2 extends Object
{
	public void show1(){
		System.out.println("Test2.show1()");
		show2();
	}
	private void show2(){
		System.out.println("Test2.show2()");
	}
}
public class _2ObjectClassDemo extends Object {

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.show1();

	}

}
