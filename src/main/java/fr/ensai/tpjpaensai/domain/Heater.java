package fr.ensai.tpjpaensai.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Heater {
	long id;

	
	String name;
	long power;
	
	
	Home home;
	
	
	@ManyToOne
	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		this.home = home;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPower() {
		return power;
	}
	public void setPower(long power) {
		this.power = power;
	}


}
