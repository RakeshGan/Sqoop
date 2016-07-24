
  class PizzaHut{
	private void bake(){
		System.out.println("bake()");
	}
	public void addPaste(){
		bake();
		System.out.println("addPaste()");
	}
	public void addToppings(){
		System.out.println("addToppings()");
	}
	
	public void addSpice(){
		System.out.println("addSpice()");
	}
}

class PazzaHut extends PizzaHut  //Not allowed
{
	
}

public class _6FinalClassDemo2 {
public static void main(String[] args) {
	PizzaHut pizza1=new PizzaHut();
	
	
	
}
}
