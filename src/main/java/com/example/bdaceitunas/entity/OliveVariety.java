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
@Table(name = "OLIVE_VARIETIES")
public class OliveVariety implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 7007148169094150285L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "XKEY", nullable = false, unique=true)	
	private String key;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	
	@OneToMany(mappedBy = "oliveVariety") 
	private List<Ticket> ticketList;
	
	
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
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ticketList
	 */
	public List<Ticket> getTicketList() {
		return ticketList;
	}

	/**
	 * @param ticketList the ticketList to set
	 */
	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

}
