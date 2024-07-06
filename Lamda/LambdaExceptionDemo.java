interface DoubleNumericArrayFunc { //lambda use karne k liye functional interface 
	double func(double[] n) throws EmptyArrayException;
}
class EmptyArrayException extends Exception { //khud ka exception bna rhe 
	EmptyArrayException() {
		super("ArrayEmpty");
	}		
}
class LambdaExceptionDemo {
	public static void main(String args[]) throws EmptyArrayException { //exception forward karre
		double[] values = {1.0,2.0,3.0,4.0};
		DoubleNumericArrayFunc average = (n) -> { //interface ka reference
			double sum = 0;
			if(n.length == 0)
				throw new EmptyArrayException();
			for(int i = 0; i < n.length; i++)
				sum+= n[i];
			return sum/n.length;
		};
		System.out.println("The average is " + average.func(values)); //interface ka reference,coding ka data type
		System.out.println("The average is " + average.func(new double[0])); //0 elements
	}
}
