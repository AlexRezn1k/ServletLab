package ua.nure.reznik.Lab2;

public class User {
	
	private String login;
	private String password;
	private String fullName;
	private String email;
	private Role role;
	
	public User(String login, String password, String email, String fullName, Role role){
		this.login = login;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.role = role;
	}	

	public String getLogin(){
		return this.login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getFullName(){
		return this.fullName;
	}
	
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public Role getRole(){
		return this.role;
	}
	
	public void setRole(Role role){
		this.role = role;
	}

}
