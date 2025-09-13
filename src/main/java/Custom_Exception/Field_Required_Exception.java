package Custom_Exception;

public class Field_Required_Exception extends RuntimeException {
	public Field_Required_Exception(String s) {
		super(s);
	}
}
