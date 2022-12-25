package server;

import java.io.Serializable;
import java.util.Objects;

public class RegistrovanKorisnik implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2267379254948507345L;
	private String username;
	private String password;
	private String ime;
	private String prezime;
	private String jmbg;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	

	public RegistrovanKorisnik(String username, String password, String ime, String prezime, String jmbg,
			String email) {
		super();
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, jmbg, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrovanKorisnik other = (RegistrovanKorisnik) obj;
		return Objects.equals(email, other.email) && Objects.equals(jmbg, other.jmbg)
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "RegistrovanKorisnik [username=" + username + ", password=" + password + ", ime=" + ime + ", prezime="
				+ prezime + ", jmbg=" + jmbg + ", email=" + email + "]";
	}
	
	
}
