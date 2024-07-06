import java.util.Scanner;
class Case {
public static void main(String args[]) {
String s;
System.out.println("Enter char:");
Scanner n = new Scanner(System.in);
s = n.nextLine();
System.out.println(s);
int a = s.length();
System.out.println(a);
if(a==1){

char r =s.charAt(0);
if(r>64 && r<92)
{
	System.out.println("U");
}
	else if(r>96 && r<124)
{
	System.out.println("L");
}
	else if(r>47 && r<59) {
System.out.println("D");
}
else{
System.out.println("S");	
}
}
else {
System.err.println("Wrong input");
}
} 
}
