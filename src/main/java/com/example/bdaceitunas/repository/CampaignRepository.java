/**
 * 
 */
package com.example.bdaceitunas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bdaceitunas.entity.Campaign;

/**
 * @author mjmuniz
 *
 */

public interface CampaignRepository extends JpaRepository<Campaign, Long>{
	
}
