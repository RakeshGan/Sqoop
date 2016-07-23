class Employee1 {
	String empName;
	int empAge;
	float empSalary;

	public Employee1() {
		System.out.println("Employee()");
		empName = "suraj";
		empAge = 12;
		empSalary = 5000f;
	}

	public void display() {
		System.out.println("Employee.display()");
		System.out.println(empName + " " + empAge + " " + empSalary);
	}
}

public class _1ConstructorDemo1 {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();// object of employee gets created
										// created and in that process
										// Employee() constructor gets called.
		Employee1 emp2 = new Employee1();
		Employee1 emp3 = new Employee1();

		System.out.println(emp1.empName + " " + emp1.empAge + " "
				+ emp1.empSalary);
		emp2.display();
		emp3.display();

	}

}
