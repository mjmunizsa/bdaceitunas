
package com.example.bdaceitunas.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdaceitunas.entity.OliveVariety;
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
	public Collection<OliveVariety> findAll() {
		return oliveVarietyServiceImpl.findAll();
	}

}
