import java.util.Scanner;
public enum Material {
	Iron, Steel, Wooden;
	public static Material acceptMaterial() {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(str.trim().toLowerCase().equals("iron"))
			return Iron;
		if(str.trim().toLowerCase().equals("steel"))
			return Steel;
		else
			return Wooden;
	}
};
