package Excep.MyExceptionClasses;
public class BiggerValueException extends Exception {
	
	protected String msg;
	
	public BiggerValueException() {
		msg = new String();
	}
	
	public BiggerValueException(String msg) {
		this.msg = msg;
	}
	
	public void setMessage(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

