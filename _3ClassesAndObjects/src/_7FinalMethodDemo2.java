
   class PizzaHut7{
	private void bake(){
		System.out.println("PizzHut7.bake()");
	}
	public final  void addPaste(){
		bake();
		System.out.println("PizzHut7.addPaste()");
	}
	public void addToppings(){
		System.out.println("PizzHut7.addToppings()");
	}
	
	public void addSpice(){
		System.out.println("PizzHut7.addSpice()");
	}
}

  class PazzaHut7 extends PizzaHut7{
		
	public void addToppings() {//method overriding
		super.addToppings();//calls parents class addToppings()
		System.out.println("PazzHut7.addToppings()");
	}
	public  void addPaste(String str){
		System.out.println("PazzHut7.addPaste(-)");
	}
	public void addSpice(String str) {//method overloading
		System.out.println("PazzHut7.addToppings(-)");
	}
  }


public class _7FinalMethodDemo2 {
public static void main(String[] args) {
	PizzaHut7 pizza1=new PizzaHut7();
	
	/*pizza1.addPaste();
	pizza1.addSpice();
	pizza1.addToppings();*/
	
	PazzaHut7 pazza1=new PazzaHut7();
	pazza1.addPaste();//bake()+addPaste() of Super class
	pazza1.addSpice();//super clas addSpice()
	pazza1.addToppings();//child version addToppings will be called
	pazza1.addPaste("Garlic");//child
	pazza1.addSpice("white sauce");//child
	
}
}
