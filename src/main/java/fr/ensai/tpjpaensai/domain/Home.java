package fr.ensai.tpjpaensai.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Home {
	long id;
	String address;

	
	
	long nbPiece;
	
	List<Heater> heater;
	Person owner;

	@OneToMany(mappedBy="home")
	public List<Heater> getHeater() {
		return heater;
	}
	public void setHeater(List<Heater> heater) {
		this.heater = heater;
	}
	@ManyToOne
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	/**
	 * deded
	 * @return
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getNbPiece() {
		return nbPiece;
	}
	public void setNbPiece(long nbPiece) {
		this.nbPiece = nbPiece;
	}

}
