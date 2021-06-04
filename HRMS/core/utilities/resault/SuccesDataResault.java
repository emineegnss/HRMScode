package kodlama.io.HRMS.core.utilities.resault;



public class SuccesDataResault<T> extends DataResault<T> {
	public SuccesDataResault(T data, String message) {
		super(data,true,message);
	
	}
	public SuccesDataResault(T data) {
		super(data, true);
	}
	public SuccesDataResault(String message) {
		super(null,true,message);
	}
	public SuccesDataResault() {
		super(null,true);
	}
}
