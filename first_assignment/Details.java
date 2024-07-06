import java.util.Scanner;
class Details {
	public static void main(String args[]) {
		String name,address;
		long num;
		System.out.println("Enter your name:");
		Scanner n = new Scanner(System.in);
		name = n.nextLine();
		System.out.println("Enter your address:");
		Scanner a = new Scanner(System.in);
		address = a.nextLine();
		System.out.println("Enter your mobile number:");
		Scanner nu = new Scanner(System.in);
		num = nu.nextLong();
		System.out.println("\nName: " +name +"\nAddress: " +address + "\nMobile number:" +num);
	}
}
