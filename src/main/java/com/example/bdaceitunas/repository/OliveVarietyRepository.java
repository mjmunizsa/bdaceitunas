/**
 * 
 */
package com.example.bdaceitunas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.bdaceitunas.entity.OliveVariety;
import com.google.common.base.Optional;

/**
 * @author mjmuniz
 *
 */


public interface OliveVarietyRepository extends JpaRepository<OliveVariety, Long>{
	

	Optional<OliveVariety> findByDescription(@Param ("description") String description);

}
