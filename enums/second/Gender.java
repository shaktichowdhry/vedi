import java.util.Scanner;
public enum Gender {
	Male, Female;
	public static Gender acceptGen() {
		String str;
		Scanner gen = new Scanner(System.in);
		Abc:
		while(true) {
			str = gen.nextLine();
			if(str.trim().toLowerCase().equals("male"))
				return Male;
			if(str.trim().toLowerCase().equals("female"))
				return Female;
			else {
				System.out.print("Wrong Input. \nRe-enter Gender:");
				continue Abc;
			}
		}
	}
};
