import java.util.Scanner; 
enum House {
	Palash("Orange"), Gulmohar("Red"), Kachnar("Purple"), Amaltas("Yellow");
	protected String colour; 	
	House (String colour) {
		this.colour = colour; 
	}
	public String getColour() {
		return colour;
	}
	public static House acceptHouse() {
		String str;
		Scanner h = new Scanner(System.in);
		Abc:
		while(true) {
		str = h.nextLine();
		if(str.trim().toLowerCase().equals("palash"))
			return Palash;
		if(str.trim().toLowerCase().equals("gulmohar"))
			return Gulmohar;
		if(str.trim().toLowerCase().equals("kachnar"))
			return Kachnar;
		if(str.trim().toLowerCase().equals("amaltas"))
			return Amaltas;
		else {
			System.out.print("Wrong Input.\nRe-write House:");
			continue Abc;
		}
		}
	}
};
