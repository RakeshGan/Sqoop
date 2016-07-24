final class Demo5{//This class cannot be extended
	public void sayHello(){
		System.out.println("Demo5.sayHello()");
	}
}

class Demo5Child{//You cannot extend Demo5 class
	public void sayHi(){
		System.out.println("Demo5Child.sayHi()");
	}
}

public class _5FinalClassDemo extends Object{
	public static void main(String[] args) {
		
		Demo5 d5=new Demo5();//aggreation
		Demo5Child d6=new Demo5Child();//aggreation
		
		d5.sayHello();
		d6.sayHi();
		
	}
}
