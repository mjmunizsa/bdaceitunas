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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mjmuniz
 *
 */
@Entity
@Table(name = "PARCEL_LANDS")
public class ParcelLand implements Serializable {

	
	
	private static final long serialVersionUID = -8571861893470039035L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "XKEY", nullable = false, unique=true)	
	private String key;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name ="ACTIVE", nullable = false, columnDefinition="boolean default true")
	private Boolean active = true;
	
	@Column(name="POLYGON")
	private String polygon;
	
	@Column(name="PARCEL")
	private String parcel;
	
	@Column(name="REGISTRY_REFERENCE")
	private String registryReference;

	@ManyToOne
    @JoinColumn(name="PARCEL_OWNER")
	private ParcelOwner parcelOwner;
	
	@OneToMany(mappedBy = "parcelLand") 
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

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * @return the polygon
	 */
	public String getPolygon() {
		return polygon;
	}

	/**
	 * @param polygon the polygon to set
	 */
	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}

	/**
	 * @return the parcel
	 */
	public String getParcel() {
		return parcel;
	}

	/**
	 * @param parcel the parcel to set
	 */
	public void setParcel(String parcel) {
		this.parcel = parcel;
	}

	/**
	 * @return the registryReference
	 */
	public String getRegistryReference() {
		return registryReference;
	}

	/**
	 * @param registryReference the registryReference to set
	 */
	public void setRegistryReference(String registryReference) {
		this.registryReference = registryReference;
	}

	/**
	 * @return the parcelOwner
	 */
	public ParcelOwner getParcelOwner() {
		return parcelOwner;
	}

	/**
	 * @param parcelOwner the parcelOwner to set
	 */
	public void setParcelOwner(ParcelOwner parcelOwner) {
		this.parcelOwner = parcelOwner;
	}

}
