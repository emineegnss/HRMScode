package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.EmployeesService;
import kodlama.io.HRMS.business.abstracts.UserService;
import kodlama.io.HRMS.core.abstracts.ValidationService;
import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.core.utilities.resault.SuccesDataResault;
import kodlama.io.HRMS.dataAccess.abstracts.EmployeesDao;
import kodlama.io.HRMS.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService {

	private EmployeesDao employeesDao;
	private ValidationService validationService;
	private UserService userService;
	@Autowired
	public EmployeesManager(EmployeesDao employeesDao,
			ValidationService validationService,
			UserService userService) {
		super();
		this.employeesDao = employeesDao;
		this.validationService = validationService;
		this.userService = userService;
	}
	@Override
	public void add(Employees employees) {
		 if (validationService.check(employees) == false) {
	            System.out.println("Geçersiz e-posta!!");

	            return;
	        }
		 if(userService.existsByEmail(employees.getEmail())) {
			 System.out.println("Email kullanılmakta! Tebrik ederim <3");
			 return;
		 }
		employeesDao.save(employees);
		
	}

	@Override
	public void delete(int id) {
		employeesDao.deleteById(id);
		
	}
	@Override
	public DataResault<List<Employees>> getAll() {
		
		return new SuccesDataResault<List<Employees>>
		(this.employeesDao.findAll(),"Employees data Listelendi");
	}

	

}
