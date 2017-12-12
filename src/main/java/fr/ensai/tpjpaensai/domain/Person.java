package fr.ensai.tpjpaensai.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity

@NamedQueries({
	@NamedQuery(name="touteslespersonnes",query="select p.name from Person as p "),
	@NamedQuery(name="touteslespersonnesparnom",query="select p from Person as p where p.name=:name")

	}
)
public class Person {
	
	
	long id;
	String name, firstname;
	
	
	List<Person> friends;
	List<Home> homes;
	@OneToMany
	List<ElectronicDevices> devices;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@ManyToMany(fetch=FetchType.LAZY)
	public List<Person> getFriends() {
		return friends;
	}
	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	@OneToMany(mappedBy="owner")
	public List<Home> getHomes() {
		return homes;
	}
	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}
	@OneToMany(mappedBy="owner")
	public List<ElectronicDevices> getDevices() {
		return devices;
	}
	public void setDevices(List<ElectronicDevices> devices) {
		this.devices = devices;
	}
	

}
