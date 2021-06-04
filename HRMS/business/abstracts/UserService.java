package kodlama.io.HRMS.business.abstracts;


import kodlama.io.HRMS.entities.concretes.Users;
public interface UserService {

	boolean existsByEmail(String Email);
	
	
}
