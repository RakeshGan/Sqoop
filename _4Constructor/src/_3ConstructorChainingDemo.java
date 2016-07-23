class Employee3 {
	String empName;
	int empAge;
	float empSalary;

	public Employee3(String eName) {
		//this(20,5000);
		System.out.println("Employee3(-)");
		empName = eName;
	}
	
	public Employee3(int eName) {
		//this(20,5000);
		System.out.println("Employee3(-)");
		//empName = eName;
	}

	public Employee3(int eAge, int eSalary) {
		this(12);
		System.out.println("Employee3(-,-)");
		empAge = eAge;
		empSalary = eSalary;
	}

	public void display() {
		System.out.println("Employee3.display()");
		System.out.println(empName + " " + empAge + " " + empSalary);
	}
}

public class _3ConstructorChainingDemo {
	public static void main(String[] args) {
		//Employee3 emp1 = new Employee3();//not allowed,no constructor with 0 param
		
		/*Employee3 emp1=new Employee3(20,5000);
		emp1.display();*/
		
		Employee3 emp2=new Employee3("Rajesh");
		emp2.display();
	}

}
