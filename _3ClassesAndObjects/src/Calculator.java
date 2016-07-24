import java.math.BigDecimal;


public class Calculator{
	public int sum(int x,int y){
		//return x+y;
		//return x-(-y);
		//return x|y;//some way to add two numbers
		
		BigDecimal num1=new BigDecimal(x);
		BigDecimal num2= new BigDecimal(y);
		
		BigDecimal total=num1.add(num2);
		return total.intValue();
	}
	
	public int subtract(int x,int y){
		
		BigDecimal num3=new BigDecimal(x);
		BigDecimal num4= new BigDecimal(y);
		
		BigDecimal sub=num3.subtract(num4);
		return sub.intValue();
	}
}