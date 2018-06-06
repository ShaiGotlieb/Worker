//new class of IllegalArgumentException 
public class IllegalArgumentException extends RuntimeException{
	
	//variable that contain error message
	private String msg;

	//constructor - get error message and initialize into the string msg
	public IllegalArgumentException(String errorMsg) {
		this.msg = errorMsg;
	}
}//end class IllegalArgumentException
