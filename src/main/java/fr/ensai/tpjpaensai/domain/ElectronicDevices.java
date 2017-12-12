package fr.ensai.tpjpaensai.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ElectronicDevices {
	
	long id;
	
	long power;
	
	Person owner;
	
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
	public long getPower() {
		return power;
	}
	public void setPower(long power) {
		this.power = power;
	}
	@ManyToOne
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}


}
