package kodlama.io.HRMS.business.abstracts;
import java.util.List;

import kodlama.io.HRMS.core.utilities.resault.DataResault;

import kodlama.io.HRMS.entities.concretes.Employers;


public interface EmployersService {
	void add(Employers employers);
	void delete(int id);
	DataResault<List<Employers>> getAll();
	
}
