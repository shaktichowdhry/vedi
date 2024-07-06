package Excep.MyExceptionClasses;
public class NoCubeException extends Exception {
	
	protected String msg;
	
	public NoCubeException() {
		msg = new String();
	}
	
	public NoCubeException(String msg) {
		this.msg = msg;
	}
	
	public void setMessage(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

