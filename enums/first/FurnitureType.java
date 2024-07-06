import java.util.Scanner;
public enum FurnitureType {
	Chair, Table, Bed;
	public static FurnitureType type() {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(str.trim().toLowerCase().equals("chair"))
			return Chair;
	       	if(str.trim().toLowerCase().equals("table"))
			return Table;
		else
			return Bed;	
	}
};
