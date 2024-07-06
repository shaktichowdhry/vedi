/**
 * Create a class called Employee that stores his code and name
 * Create two derive classes of employee named TempEmp and PerEmp
 * TempEmp should store wagegrade andnumber of days worked whereas PerEmp should store department designation and basic salary
 * write constructors, getter/setters and appropriate operations
 */
import java.util.Scanner;
abstract class Employee {
	protected String code;
	protected String name;
	public Employee() {
	}
	public Employee(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public void acceptData() {
		System.out.print("Enter code: ");
		Scanner code = new Scanner(System.in);
		this.code = code.nextLine();
		System.out.print("Enter name: ");
		Scanner name = new Scanner(System.in);
		this.name = name.nextLine();
	}
	public void showData() {
		System.out.println("Name: " + name);
		System.out.println("Code: " + code);
	}
}
class TempEmp extends Employee {
	protected float wageGrade;
	protected int numDays;
	public TempEmp() {
	}
	public TempEmp(String code, String name) {
		super(code,name);
	}
	public TempEmp(float wageGrade, int numDays) {
		this.wageGrade = wageGrade;
		this.numDays = numDays;
	}
	public void setG(float wageGrade) {
		this.wageGrade = wageGrade;
	}	
	public void setD(int numDays) {
		this.numDays = numDays;
	}
	public float getG() {
		return wageGrade;
	}
	public int getD() {
		return numDays;
	}
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter wage grade: ");
		Scanner wageGrade = new Scanner(System.in);
		this.wageGrade = wageGrade.nextFloat();
		System.out.print("Enter number od days worked: ");
		Scanner numDays = new Scanner(System.in);
		this.numDays = numDays.nextInt();
	}
	public void showData() {
		super.showData();
		System.out.println("Wage grade: " + wageGrade);
		System.out.println();
	}
	public static void main(String args[]) {
		TempEmp t = new TempEmp();
		t.acceptData();
		t.showData();
	}

}
class PerEmp extends Employee {
	protected String department;
	protected String designation;
      	protected float	bs ;
	public PerEmp() {
	}
	public PerEmp(String code, String name) {
		super(code,name);
	}
	public PerEmp(String department, String designation, float bs) {
		this.department = department;
		this.designation = designation;
		this.bs = bs;
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
		super.acceptData();
		System.out.print("Enter Department name: ");
		Scanner in = new Scanner(System.in);
		this.department = in.nextLine();
	       	System.out.print("Enter designation: ");
		this.designation = in.nextLine();
		System.out.print("Enter basic salary: ");
		Scanner bs = new Scanner(System.in);
	      	this.bs = bs.nextFloat();
	}
	public void showData() {
		super.showData();
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
		PerEmp e = new PerEmp();
		e.acceptData();
		System.out.println("Hra: " + e.getHra() + "\nDa: " + e.getDa() + "\nCa: " + e.getCa());		
	}
}

