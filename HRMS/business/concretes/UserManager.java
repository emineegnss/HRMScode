package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.UserService;
import kodlama.io.HRMS.core.abstracts.ValidationService;
import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.core.utilities.resault.SuccesDataResault;
import kodlama.io.HRMS.dataAccess.abstracts.UserDao;
import kodlama.io.HRMS.entities.concretes.Employers;
import kodlama.io.HRMS.entities.concretes.Users;
@Service
public class UserManager implements UserService {

	private ValidationService validationService;
	private UserDao userDao;
	@Autowired
	public UserManager(ValidationService validationService, UserDao userDao) {
		super();
		this.validationService = validationService;
		this.userDao = userDao;
	}
	
	
	


	@Override
	public boolean existsByEmail(String Email) {
		
		return userDao.existsByEmail(Email);
	}




}
