import java.util.Scanner;

@What(description = "description from class student.")
public class Student {
	protected long eno;
       	protected String name;
	protected Gender gen;
	protected int class_no;
	protected char sec;
	protected House house;

	public Student() {
		name = new String();
		gen = Gender.MALE;
		house = House.PALASH;
	}	

	public Student(long eno, String name, Gender gen, int class_no, char sec, House house) {
		this.eno = eno;
		this.name = name;
		this.gen = gen;
		this.class_no = class_no;
		this.sec = sec;
		this.house = house;
	}

	@Changes(change = "changeAccept", madeBy = "Anno3", madeOn = "acceptData")
	@Special
	@What(description = "description from Method acceptData of student class.")
	public void acceptData() {
		Scanner e  = new  Scanner(System.in);
	       	System.out.print("Enter enrollment number:");
		this.eno = e.nextLong();
		e.nextLine();
		System.out.print("\nEnter name:");
		this.name = e.nextLine();
		System.out.print("\nEnter gender(ex-male,female):");	
		this.gen = Gender.acceptGen();
		Scanner c = new Scanner(System.in);
		System.out.print("\nEnter class number:");
		this.class_no = c.nextInt();
		System.out.print("\nEnter section:");
		this.sec = e.nextLine().charAt(0);
		System.out.print("\nEnter House(ex-palash, gulmohar, kachnar, amaltas):");
		this.house = House.acceptHouse();
	}

	@Changes(change = "changeShow", madeBy = "Anno3", madeOn = "showData")
	@Special
	@What(description = "description from method showData of student class.")
	public void showData() {
		System.out.println("\nEnrollment Number: " + eno);
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gen);
		System.out.println("Class: " + class_no);
		System.out.println("Section: " + sec);
		System.out.println("House: " + house + " \"" + house.getColour() + "\"");
	}

	@Changes(change = "changeMain", madeBy = "Anno3", madeOn = "Main")
	@What(description = "description from main methos of student class.")
	public static void main(String args[]) {
		Student s = new Student();
		s.acceptData();
		s.showData();
	}
}
