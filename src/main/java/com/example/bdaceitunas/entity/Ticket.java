/**
 * 
 */
package com.example.bdaceitunas.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mjmuniz
 *
 */
@Entity
@Table(name = "TICKETS")
public class Ticket implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -389753021403013408L;


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;

	
	@Column (name="NUMBER_OF_TICKET", nullable=false)
	private String numberOfTicket;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_TICKET", nullable = false)
	private Date ticketDate;

	@Column(name = "WEIGHT", nullable = false)
	private Long weight;
	
	@Column(name = "OILPERCENTAGE")
	private BigDecimal oilPercentage;
	
	@Column(name = "TOTAL_COST")
	private BigDecimal totalCost;
	
	@Column(name = "ACIDITY")
	private BigDecimal acidity;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PARCEL_LAND")
	private ParcelLand parcelLand;

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OLIVE_VARIETY")
	private OliveVariety oliveVariety;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OWNER_TICKET")
	private ParcelOwner ownerTicket;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CAMPAIGN")
	private Campaign campaign;
	
	
	/**
	 * 
	 */
	public Ticket() {
		super();
	}
	
	public Ticket(Long id, Date ticketDate, Long weight, OliveVariety oliveVariety) {
		super();
        this.id=id;
        this.weight = weight;
        this.oliveVariety = oliveVariety;
	}
	
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
	 * @return the ticketDate
	 */
	public Date getTicketDate() {
		return ticketDate;
	}

	/**
	 * @param ticketDate the ticketDate to set
	 */
	public void setTicketDate(Date ticketDate) {
		this.ticketDate = ticketDate;
	}

	/**
	 * @return the weight
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * @return the oliveVariety
	 */
	public OliveVariety getOliveVariety() {
		return oliveVariety;
	}

	/**
	 * @param oliveVariety the oliveVariety to set
	 */
	public void setOliveVariety(OliveVariety oliveVariety) {
		this.oliveVariety = oliveVariety;
	}

	/**
	 * @return the numberOfTicket
	 */
	public String getNumberOfTicket() {
		return numberOfTicket;
	}

	/**
	 * @param numberOfTicket the numberOfTicket to set
	 */
	public void setNumberOfTicket(String numberOfTicket) {
		this.numberOfTicket = numberOfTicket;
	}

	/**
	 * @return the oilPercentage
	 */
	public BigDecimal getOilPercentage() {
		return oilPercentage;
	}

	/**
	 * @param oilPercentage the oilPercentage to set
	 */
	public void setOilPercentage(BigDecimal oilPercentage) {
		this.oilPercentage = oilPercentage;
	}

	/**
	 * @return the totalCost
	 */
	public BigDecimal getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @return the acidity
	 */
	public BigDecimal getAcidity() {
		return acidity;
	}

	/**
	 * @param acidity the acidity to set
	 */
	public void setAcidity(BigDecimal acidity) {
		this.acidity = acidity;
	}

	/**
	 * @return the parcelLand
	 */
	public ParcelLand getParcelLand() {
		return parcelLand;
	}

	/**
	 * @param parcelLand the parcelLand to set
	 */
	public void setParcelLand(ParcelLand parcelLand) {
		this.parcelLand = parcelLand;
	}

	/**
	 * @return the ownerTicket
	 */
	public ParcelOwner getOwnerTicket() {
		return ownerTicket;
	}

	/**
	 * @param ownerTicket the ownerTicket to set
	 */
	public void setOwnerTicket(ParcelOwner ownerTicket) {
		this.ownerTicket = ownerTicket;
	}

	/**
	 * @return the campaign
	 */
	public Campaign getCampaign() {
		return campaign;
	}

	/**
	 * @param campaign the campaign to set
	 */
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
