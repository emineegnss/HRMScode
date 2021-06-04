package kodlama.io.HRMS.core.utilities.resault;



public class ErrorDataResault<T> extends DataResault<T> {
	public ErrorDataResault(T data, String message) {
		super(data,false,message);
	}
	public ErrorDataResault(T data) {
		super(data,false);
	}
	
	public ErrorDataResault(String message) {
		super(null,false,message);
	}
	public ErrorDataResault() {
		super(null,false);
	}
}
