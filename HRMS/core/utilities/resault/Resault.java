package kodlama.io.HRMS.core.utilities.resault;

public class Resault {
	private boolean success;
	private String message;
	public Resault(boolean success) {
		this.success = success;
	}
	public Resault(boolean success,String message) {
		this.success = success;
		this.message = message;
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}
}
