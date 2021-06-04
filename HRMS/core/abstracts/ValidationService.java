package kodlama.io.HRMS.core.abstracts;

import kodlama.io.HRMS.entities.concretes.Users;

public interface ValidationService {
	boolean check(Users users);
}
