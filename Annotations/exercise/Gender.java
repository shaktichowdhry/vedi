import java.util.Scanner;

@What(description = "description from enum Gender.")
public enum Gender {
	MALE, FEMALE;
	@What(description = "description from Method acceptGen.")
	public static Gender acceptGen() {
		String str;
		Scanner gen = new Scanner(System.in);
		Abc:
		while(true) {
			str = gen.nextLine();
			if(str.trim().toLowerCase().equals("male"))
				return MALE;
			if(str.trim().toLowerCase().equals("female"))
				return FEMALE;
			else {
				System.out.print("Wrong Input. \nRe-enter Gender:");
				continue Abc;
			}
		}
	}
};
