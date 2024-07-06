/**
 * Create a class called Student that stores student name, class, section and marksin 4 subjects
 * write constructors, getter/setters, behaviour and operations to accept and display the data
 * Also provide operations that return total and percentage
 * Test the class by creating an implementation function(main)
 */
import java.util.Scanner;
class Student {
	protected String name;
	protected byte classs;
	protected char section;
	protected float bme;
        protected float	m2;
       	protected float bce; 
	protected float phy;
	public Student() {
	}
	public Student(String name, byte classs, char section, float bme, float m2, float bce, float phy) {
		this.name = name;
		this.classs = classs;
		this.section = section;
		this.bme = bme;
		this.m2 = m2;
		this.bce = bce;
		this.phy = phy;
	}
	public String getName() {
		return name;
	}
	public byte getClasss() {
		return classs;
	}
	public char getSection() {
		return section;
	}
	public float getBme() {
		return bme;
	}
	public float getM2() {
		return m2;
	}
	public float getBce() {
		return bce;
	}
	public float getPhy() {
		return phy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClasss(byte classs) {
		this.classs = classs;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public void setPhy(float phy) {
		this.phy = phy;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public void setBce(float bce) {
		this.bce = bce;
	}
	public void setBme(float bme) {
		this.bme = bme;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		this.name = in.nextLine();
		Scanner c = new Scanner(System.in);
		System.out.print("Enter class:");
		this.classs = c.nextByte();
		System.out.print("Enter section:");
		this.section = in.nextLine().charAt(0);
		System.out.print("Enter marks in basic mechanical engineering:");
		this.bme = in.nextFloat();
		System.out.print("Enter your marks in engineering mathematics:");
		this.m2 = in.nextFloat();
		System.out.print("Enter your marks in basic computer engineering:");
		this.bce = in.nextFloat();
		System.out.print("Enter your marks in physics:");
		this.phy = in.nextFloat();
	}
	public void showData() {
		System.out.println("Name: " + name);
		System.out.println("Class: " + classs);
		System.out.println("Section: " + section);
		System.out.println("Marks in BME: " + bme);
		System.out.println("Marks in M2: " + m2);
		System.out.println("Marks in BCE: " + bce);
		System.out.println("Marks in PHYSICS: " + phy);
	}
	public float getTotal() {
		return (bme+bce+m2+phy);
	}
	public float getPer() {
		return ((getTotal())*100)/400;
	}
	public static void main(String args[]) {
		Student s = new Student();
		s.acceptData();
		s.showData();
		System.out.println("Total: " + s.getTotal() + "\nPercentage: " + s.getPer());
	}
}
