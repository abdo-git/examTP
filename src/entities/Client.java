package entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	private int code;
	private String nom;
	private String ville;
	private List<Client> listClients = new ArrayList<>();
	public Client(int code, String nom, String ville) {
		super();
		this.code = code;
		this.nom = nom;
		this.ville = ville;
	}
	public Client() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	public List<Client> getListClients() {
		return listClients;
	}
	public void setListClients(List<Client> listClients) {
		this.listClients = listClients;
	}
	public String addClient() {

		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(this);
	
		trans.commit();
		listClients=session.createQuery("from Client").list();
		
		return "succes";
	}
	
	public String loadClients() {
		
		
		return "succes";
	}
}
