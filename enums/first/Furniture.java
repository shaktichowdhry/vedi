import java.util.Scanner;
class Furniture {

	protected String Mod_no;
       	protected String Mod_name;
	protected String Mod_des;
	protected Material m;
	protected FurnitureType t;

	public Furniture() {
		this.Mod_no = new String();
		this.Mod_name = new String();
		this.Mod_des = new String();

	}
	public Furniture(String Mod_no, String Mod_name, String Mod_des, Material m, FurnitureType t) {
		this.Mod_no = Mod_no;
		this.Mod_name = Mod_name;
		this.Mod_des = Mod_des;
		this.m = m;
		this.t = t;
	}

	public void acceptData() {
		Scanner st = new Scanner(System.in);
		System.out.print("Enter Model number:");
		Mod_no = st.nextLine();
		System.out.print("\nEnter Model Name:");
		Mod_name = st.nextLine();
		System.out.print("\nEnter Model description:");
		Mod_des = st.nextLine();
		System.out.print("\nEnter Material of furniture(ex-iron,steel,wooden):");
		m = Material.acceptMaterial();
		System.out.print("\nEnter Type of furniture(ex-chair,table,bed):");
		t = FurnitureType.type(); 
	}

	public void showData() {
		System.out.println("\nModel Number: " + Mod_no);
		System.out.println("Model Name: " + Mod_name);
		System.out.println("Model Description: " + Mod_des);
		System.out.println("Material: " + m);
		System.out.println("Type: " + t);
	}

	public static void main(String args[]) {
		Furniture f = new Furniture();
		f.acceptData();
		f.showData();	
	}
}

