package kodlama.io.HRMS.core.concretes;



import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import kodlama.io.HRMS.core.abstracts.ValidationService;
import kodlama.io.HRMS.entities.concretes.Users;
@Component
public class EmailCheck implements ValidationService {
	  String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
	  Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);

	@Override
	public boolean check(Users users) {
		Matcher matcher = emailPattern.matcher(users.getEmail());
        if (matcher.matches()){
            return true;
       }else {

            return false;
       }
	}

}
