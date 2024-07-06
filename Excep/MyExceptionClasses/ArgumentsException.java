package Excep.MyExceptionClasses;
public class ArgumentsException extends Exception {
	
	protected String msg;
	
	public ArgumentsException() {
		msg = new String();
	}
	
	public ArgumentsException(String msg) {
		this.msg = msg;
	}
	
	public void setMessage(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

