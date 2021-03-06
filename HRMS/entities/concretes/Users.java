package kodlama.io.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
    public Users() {
		
	}
	public Users(int id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}
}
