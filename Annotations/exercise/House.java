import java.util.Scanner; 

@What(description = "Description from enum house.")
enum House {
	PALASH("Orange"), GULMOHAR("Red"), KACHNAR("Purple"), AMALTAS("Yellow");
	protected String colour; 	
	House (String colour) {
		this.colour = colour; 
	}
	public String getColour() {
		return colour;
	}
	
	@What(description = "description from method acceptHouse.")
	public static House acceptHouse() {
		String str;
		Scanner h = new Scanner(System.in);
		Abc:
		while(true) {
		str = h.nextLine();
		if(str.trim().toLowerCase().equals("palash"))
			return PALASH;
		if(str.trim().toLowerCase().equals("gulmohar"))
			return GULMOHAR;
		if(str.trim().toLowerCase().equals("kachnar"))
			return KACHNAR;
		if(str.trim().toLowerCase().equals("amaltas"))
			return AMALTAS;
		else {
			System.out.print("Wrong Input.\nRe-write House:");
			continue Abc;
		}
		}
	}
};
