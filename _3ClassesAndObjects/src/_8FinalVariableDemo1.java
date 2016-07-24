class Employee8 {
	String empName;
	float empSalary;
	int empAge;
}

public class _8FinalVariableDemo1 {
	public static void main(String[] args) {

		int x = 10;
		x++;

		final int y = 11;
		// y++;

		Employee8 emp = new Employee8();
		//bad way of programming
		emp.empName = "Suraj";
		emp.empSalary=5000;
		emp.empAge=12;
		
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(emp.empAge);
	}
}
