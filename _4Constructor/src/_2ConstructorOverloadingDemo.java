class Employee2 {
	String empName;
	int empAge;
	float empSalary;

	public Employee2() {
		System.out.println("Employee2()");
		empName = "suraj";
		empAge = 12;
		empSalary = 5000f;
		return;//go back to the caller
	}

	public Employee2(String eName, int eAge, int eSalary) {
		System.out.println("Employee2(-,-,-)");
		System.out.println(eName+" "+eAge+" "+eSalary);
		empName=eName;
		empAge=eAge;
		empSalary=eSalary;
	}

	public void display() {
		System.out.println("Employee2.display()");
		System.out.println(empName + " " + empAge + " " + empSalary);
	}
}

public class _2ConstructorOverloadingDemo {
	public static void main(String[] args) {
		/*Employee2 emp1 = new Employee2();// object of employee gets created
											// created and in that process
											// Employee() constructor gets
											// called.
		emp1.display();*/
		
		Employee2 emp2=new Employee2("Suraj", 12, 7000);
		emp2.display();
		Employee2 emp3=new Employee2("Kiran",25,8000);
		Employee2 emp4=new Employee2();
			}

}
