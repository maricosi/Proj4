package pt.uc.dei.aor.paj.data;

import java.io.Serializable;

import javax.persistence.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
@Table(name="Utilizador")
public class User implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private String email;
	private static final Logger logger = LoggerFactory.getLogger(User.class);
	
	//slf4j

	public User() {
		super();
	}
	public User(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public String getName() {
		logger.info("Nome do Utilizador");
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return name+" -> "+email;
	}
}
