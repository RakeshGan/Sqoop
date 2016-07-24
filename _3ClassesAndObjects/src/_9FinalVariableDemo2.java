class Employee9 {
	private String empName;
	private float empSalary;
	private int empAge;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	/*public String readEmployeeName(){
		return empName;
	}
	public void writeEmployeeName(String eName){
		empName=eName;
	}*/
}

public class _9FinalVariableDemo2 {
	public static void main(String[] args) {

		int x = 10;
		x++;

		 final byte num1 = 120;
		 final byte num2=7;
		
		byte b=num1+num2;
		// y++;

		final Employee9 emp = new Employee9();
		emp.setEmpName("Suraj");
		emp.setEmpAge(12);
		emp.setEmpSalary(5000f);
		
		//emp=new Employee9();//cannot re-instatiate it to final reference
		
		System.out.println(emp.getEmpName()+" "+emp.getEmpAge()+" "+emp.getEmpSalary());
		
	}
}
