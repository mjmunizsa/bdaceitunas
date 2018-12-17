/**
 * 
 */
package com.example.bdaceitunas.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.bdaceitunas.dto.CampaignSummarizedDto;
import com.example.bdaceitunas.entity.Ticket;

/**
 * @author mjmuniz
 *
 */


public interface TicketRepository extends JpaRepository<Ticket, Long>{

	
	@Query(value="SELECT ti FROM Ticket ti inner join fetch ti.parcelLand inner join fetch ti.oliveVariety inner join fetch ti.ownerTicket inner join fetch ti.campaign",
			countQuery = "select count(ti) from Ticket ti")
	public Page<Ticket> findAll(Pageable pag);
	
	@Query("SELECT new com.example.mvc.demo.dto.CampaignSummarizedDto(ca.id,ca.key,ca.description,SUM(ti.weight),AVG(ti.oilPercentage),SUM(ti.totalCost),AVG(ti.acidity)) FROM Ticket ti inner join ti.campaign ca group by ca.id,ca.key,ca.description")
	public List<CampaignSummarizedDto> getCampaignSummarized();
	
	@Query("SELECT new com.example.mvc.demo.dto.CampaignSummarizedDto(ow.id,ow.key,ow.name || ' ' || ow.givenName || ' ' || ow.motherName,SUM(ti.weight),AVG(ti.oilPercentage),SUM(ti.totalCost),AVG(ti.acidity)) "
			+ "FROM Ticket ti inner join ti.campaign ca "
			+ "inner join ti.ownerTicket ow "
			+ "where ca.id=:campaignId group by ow.id,ow.key,ow.name || ' ' || ow.givenName || ' ' || ow.motherName")
	public List<CampaignSummarizedDto> getCampaignSummarizedByTicketOwner(@Param("campaignId") final Long campaignId);
	

}
