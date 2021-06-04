package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.EmployersService;
import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.core.utilities.resault.SuccesDataResault;
import kodlama.io.HRMS.dataAccess.abstracts.EmployersDao;
import kodlama.io.HRMS.entities.concretes.Employers;
@Service
public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	@Autowired
    public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	@Override
	public void add(Employers employers) {
		
		employersDao.save(employers);
	}

	@Override
	public void delete(int id) {
		
		employersDao.deleteById(id);
	}
	@Override
	public DataResault<List<Employers>> getAll() {
		
		return new SuccesDataResault<List<Employers>>
		(this.employersDao.findAll(),"Employers data listelendi");
	}

	

}
