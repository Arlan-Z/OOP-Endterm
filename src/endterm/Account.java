package endterm;

import java.util.Objects;

public class Account implements Cloneable, Comparable<Account>{
	public String login;
	private String password;
	
	public Account()
	{
		
	}
	
	public Account(String login, String password)
	{
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [login=" + login + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int compareTo(Account o) {
		return login.compareTo(o.login);
	}
	
	
}
