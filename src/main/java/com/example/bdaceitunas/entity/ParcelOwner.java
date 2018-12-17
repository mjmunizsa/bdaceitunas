/**
 * 
 */
package com.example.bdaceitunas.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mjmuniz
 *
 */
@Entity
@Table(name = "PARCEL_OWNERS")
public class ParcelOwner implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4960576769880478412L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "XKEY", nullable = false, unique=true)	
	private String key;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "GIVEN_NAME")
	private String givenName;
	
	@Column(name = "MOTHER_NAME")
	private String motherName;
	
	@OneToMany(mappedBy = "parcelOwner") 
	private List<ParcelLand> parcelLands;
		
	@OneToMany(mappedBy = "ownerTicket") 
	private List<Ticket> tickets;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the ticketList
	 */
	public List<Ticket> getTickets() {
		return tickets;
	}

	/**
	 * @param ticketList the ticketList to set
	 */
	public void setTickets(List<Ticket> ticketList) {
		this.tickets= ticketList;
	}

	/**
	 * @return the xkey
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param xkey the xkey to set
	 */
	public void setKey(String xkey) {
		this.key = xkey;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the parcelLands
	 */
	public List<ParcelLand> getParcelLands() {
		return parcelLands;
	}

	/**
	 * @param parcelLands the parcelLands to set
	 */
	public void setParcelLands(List<ParcelLand> parcelLands) {
		this.parcelLands = parcelLands;
	}
	
	public String getDescription() {
		return getName() + " " + getGivenName() + " " + getMotherName();
	}
	
}
