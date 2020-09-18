
package com.example.bdaceitunas.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdaceitunas.dto.OliveVarietyDto;
import com.example.bdaceitunas.service.OliveVarietyServiceImpl;

/**
 * @author mjmuniz
 *
 */
@RestController
public class OliveVarietyController {
	
	@Autowired
	OliveVarietyServiceImpl oliveVarietyServiceImpl;
	
	@RequestMapping(value="/olivevariety/all", method = RequestMethod.GET)
	public Collection<OliveVarietyDto> findAll() {
		return oliveVarietyServiceImpl.findAll();
	}
	
	@RequestMapping(value="/olivevariety", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public OliveVarietyDto save(@RequestBody OliveVarietyDto oliveVarietyDto) {
		return oliveVarietyServiceImpl.save(oliveVarietyDto);
		
	}

}
