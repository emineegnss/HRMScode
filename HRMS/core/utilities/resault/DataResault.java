package kodlama.io.HRMS.core.utilities.resault;



public class DataResault<T> extends Resault{

		private T data;
		public DataResault(T data,boolean success, String message) {
			super(success, message);
			this.data = data;
			
		}
		public DataResault(T data,boolean success) {
			super(success);
			this.data = data;
		}
		public T getData() {
			return this.data;
		}

}
