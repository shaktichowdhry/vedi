/** Create a class Employee that stores its name, department, designation and basic salary
 * write constructors, getter/setter, behaviour, and operations to accept and display the data
 * Also write methods that return his incentive
 * The incentives are HRA(20%) ,DA(10%), CA (10%)
 * Test above code by creating an implemntation program
 */
import java.util.Scanner;
class Employee2 {
	protected String name = new String();
	protected String department;
	protected String designation;
      	protected float	bs ;
	public Employee2() {
	}
	public Employee2(String name, String department, String designation, float bs) {
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.bs = bs;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDep(String department) {
		this.department = department;
	}
	public void setDes(String designation) {
		this.designation = designation;
	}
	public void setBs(float bs) {
		this.bs = bs;
	}
	public String getName() {
		return name;
	}
	public String getDep() {
		return department;
	}
	public String getDes() {
		return designation;
	}
	public float getBs() {
		return bs;
	}
	public void acceptData() {
		System.out.print("Enter name: ");
		Scanner in = new Scanner(System.in);
		this.name = in.nextLine();
		System.out.print("Enter Department name: ");
		this.department = in.nextLine();
	       	System.out.print("Enter designation: ");
		this.designation = in.nextLine();
		System.out.print("Enter basic salary: ");
		Scanner bs = new Scanner(System.in);
	      	this.bs = bs.nextFloat();
	}
	public void showData() {
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Basic salary: " + bs);
	}
	public float getHra() {
		return 0.2f*bs;
	}
	public float getDa() {
		return 0.1f*bs;
	}
	public float getCa() {
		return 0.1f*bs;
	}
	public static void main(String args[]) {
		Employee2 e = new Employee2();
		e.acceptData();
		System.out.println("Hra: " + e.getHra() + "\nDa: " + e.getDa() + "\nCa: " + e.getCa());		
	}
}
