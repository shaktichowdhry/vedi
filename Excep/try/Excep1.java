class Excep1 extends Exception {
	protected String msg;
	public Excep1() {
		msg = new String();
	}
	public Excep1(String msg) {
		this.msg = msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}
