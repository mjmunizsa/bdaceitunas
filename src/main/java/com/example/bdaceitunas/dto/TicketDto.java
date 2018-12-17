/**
 * 
 */
package com.example.bdaceitunas.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author mjmuniz
 *
 */
public class TicketDto {
	
	private Long id;
	
	private String numberTicket;
	
	private Date ticketDate;
	
	private Long weight;
	
	private BigDecimal oilPercentage;
	
	private BigDecimal totalCost;
	
	private BigDecimal acidity;
	
	private String parcelLandDescription;
	
	private String oliveVarietyDescription;
	
	private String ticketOwnerDescription;

	private String ticketOwnerKey;
	
	private String campaignDescription;
	
	private String campaignKey;
	
	
	
	

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
	public String getParcelLandDescription() {
		return parcelLandDescription;
	}

	/**
	 * @param parcelLand the parcelLand to set
	 */
	public void setParcelLandDescription(String parcelLandDescription) {
		this.parcelLandDescription = parcelLandDescription;
	}

	/**
	 * @return the oliveVariety
	 */
	public String getOliveVarietyDescription() {
		return oliveVarietyDescription;
	}

	/**
	 * @param oliveVariety the oliveVariety to set
	 */
	public void setOliveVarietyDescription(String oliveVarietyDescription) {
		this.oliveVarietyDescription = oliveVarietyDescription;
	}

	/**
	 * @return the ownerTicket
	 */
	public String getTicketOwnerDescription() {
		return ticketOwnerDescription;
	}

	/**
	 * @param ownerTicket the ownerTicket to set
	 */
	public void setTicketOwnerDescription(String ticketOwnerDescription) {
		this.ticketOwnerDescription= ticketOwnerDescription;
	}
	
	/**
	 * @return the ticketOwnerKey
	 */
	public String getTicketOwnerKey() {
		return ticketOwnerKey;
	}

	/**
	 * @param ticketOwnerKey the ticketOwnerKey to set
	 */
	public void setTicketOwnerKey(String ticketOwnerKey) {
		this.ticketOwnerKey = ticketOwnerKey;
	}

	/**
	 * @return the campaignDescription
	 */
	public String getCampaignDescription() {
		return campaignDescription;
	}

	/**
	 * @param campaignDescription the campaignDescription to set
	 */
	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}

	/**
	 * @return the campaignKey
	 */
	public String getCampaignKey() {
		return campaignKey;
	}

	/**
	 * @param campaignKey the campaignKey to set
	 */
	public void setCampaignKey(String campaignKey) {
		this.campaignKey = campaignKey;
	}
	
	/**
	 * @return the numberTicket
	 */
	public String getNumberTicket() {
		return numberTicket;
	}

	/**
	 * @param numberTicket the numberTicket to set
	 */
	public void setNumberTicket(String numberTicket) {
		this.numberTicket = numberTicket;
	}


	

}
