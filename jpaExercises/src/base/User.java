package base;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private long id;
	private String name;
	private String email;
	
	///
	public User(String name, String email) {
		this();
		this.name = name;
		this.email = email;
	}
	
	public User() {
		
	}
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
