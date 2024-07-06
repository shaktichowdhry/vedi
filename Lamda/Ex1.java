/**
 *WAP that use Lambda expression as a variable.
 */

class Ex1 {
	public static void main(String arsg[]) {
		MyInterface<Double> a = ()->123.4;
		System.out.println(a.showData()); //data type of coding is interface ka reference
		
		a = ()->Math.random()*100;
		System.out.println(a.showData());

 		MyInterfaceWithArgument<Boolean> b;
		b =(t)->t%2==0;
		if(!(b.getData(11)))
	       		System.out.println("11 is odd");	
		
		MyInterface<String> c = ()->"shakti";
		System.out.println(c.showData());

		MyInterfaceWithTwoArguments<Boolean> d = (t,p)-> t%p == 0;
		if(d.showData(10,5))
			System.out.println("10 is a multiple of 5");

	}
}
