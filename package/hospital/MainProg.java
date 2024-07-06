package hospital;
import hospital.patients.Abc;
import hospital.staff.Xyz;
import hospital.staff.regular.Efg;
import hospital.staff.visiting.Lmn;
public class MainProg {
	public MainProg() {
		System.out.println("MainPack");
	}
	public static void main(String args[]) {
		Abc a = new Abc();
		Xyz x = new Xyz();
		Efg e = new Efg();
		Lmn l = new Lmn();
	}
}
