/**
 * 
 */
package com.example.bdaceitunas.dto;

import java.math.BigDecimal;

/**
 * @author mjmuniz
 *
 */
public class CampaignSummarizedDto {
	
	private Long id;
	
	private String key;
	
	private String description;
	
	private Long totalWeight;
	
	private Double avgOilPercentage;
	
	private BigDecimal totalCost;
	
	private Double avgAcidity;
	
	public CampaignSummarizedDto() {
		new CampaignSummarizedDto();
	}
	

	public CampaignSummarizedDto(Long id, String key, String description, Long totalWeight) {
		super();
		this.id = id;
		this.key = key;
		this.description = description;
		this.totalWeight = totalWeight;
	}

	
	
	
	public CampaignSummarizedDto(Long id, String key, String description, Long totalWeight, Double avgOilPercentag,
			BigDecimal totalCost, Double avgAcidity) {
		super();
		this.id = id;
		this.key = key;
		this.description = description;
		this.totalWeight = totalWeight;
		this.avgOilPercentage = avgOilPercentag;
		this.totalCost = totalCost;
		this.avgAcidity = avgAcidity; 
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
	 * @return the totalWeight
	 */
	public Long getTotalWeight() {
		return totalWeight;
	}

	/**
	 * @param totalWeight the totalWeight to set
	 */
	public void setTotalWeight(Long totalWeight) {
		this.totalWeight = totalWeight;
	}

	/**
	 * @return the avgOilPercentage
	 */
	public Double getAvgOilPercentage() {
		return avgOilPercentage;
	}

	/**
	 * @param avgOilPercentage the avgOilPercentage to set
	 */
	public void setAvgOilPercentage(Double avgOilPercentage) {
		this.avgOilPercentage = avgOilPercentage;
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
	 * @return the avgAcidity
	 */
	public Double getAvgAcidity() {
		return avgAcidity;
	}

	/**
	 * @param avgAcidity the avgAcidity to set
	 */
	public void setAvgAcidity(Double avgAcidity) {
		this.avgAcidity = avgAcidity;
	}
	
}
