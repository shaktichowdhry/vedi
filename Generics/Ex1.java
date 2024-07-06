class Ex1<T> {
	T num;
	
	public Ex1() {
	}

	public Ex1(T num) {
		this.num = num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	public T getNum() {
		return num;
	}

	public void showData() {
		System.out.println(num.getClass());
		System.out.println(num);
	}

	public static void main(String args[]) {
		Ex1<Double> obj = new Ex1<Double>(4.4);
		obj.showData();
	}
}


