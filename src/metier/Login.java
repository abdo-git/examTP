package metier;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Client;

public class Login {

	private String user;
	private String pass;
	private List<Client> listClients = new ArrayList<>();
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Login() {
		super();
	}
	public Login(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	
	
	public String signIn() {
		
		if(user.equals("admin") && pass.equals("admin")) {
			SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
			Session session = sFactory.openSession();
			listClients=session.createQuery("from Client").list();
			return "succes";
			}
		return "error";
	}
	public List<Client> getListClients() {
		return listClients;
	}
	public void setListClients(List<Client> listClients) {
		this.listClients = listClients;
	}
}
