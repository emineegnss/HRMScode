package kodlama.io.HRMS.business.abstracts;
import java.util.List;

import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.entities.concretes.Employees;


public interface EmployeesService {
	void add(Employees employees);
	void delete(int id);
	DataResault<List<Employees>> getAll();
	

}
