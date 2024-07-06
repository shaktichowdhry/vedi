class Ex2<T, V> {
	
	protected T a;
	protected V b;
	protected T c[];

	public Ex2(){
	}
	
	public Ex2(T a,V b) {
		this.a = a;
		this.b =b;
	}

	public void setA(T a) {
		this.a = a;
	}

	public void setB(V b) {
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public V getB() {
		return b;
	}

	public void showData() {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass());
		System.out.println("a: " + a + "\nb: " + b);
	}

	public static void main(String args[]) {
		Ex2<Integer, String> obj = new Ex2<Integer, String>(5, "Shakti");
		obj.showData();
	}
}
