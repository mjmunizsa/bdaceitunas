/**
 * Aviso legal
 * <p>
 * Toda la información contenida aquí es propiedad de Diners Club Spain, S.A. y está protegida por
 * la ley de propiedad intelectual. Cualquier difusión o reproducción total o parcial, incluso para
 * uso por personal interno (empleado) o externo (proveedor), por cualquier medio y bajo cualquier
 * forma, está prohibida, salvo autorización expresa por parte de Diners Club Spain, otorgada con
 * carácter previo y de forma escrita.
 * <p>
 * El uso o acceso permitido a dicha información no podrá entenderse como cesión de ninguna clase de
 * derecho de explotación sobre los citados derechos de propiedad intelectual.
 */

package com.example.bdaceitunas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdaceitunas.dto.OliveVarietyDto;
import com.example.bdaceitunas.entity.OliveVariety;
import com.example.bdaceitunas.repository.OliveVarietyRepository;

/**
 * Service to convert from stage tables entities to final tables entities
 */
@Service("oliveVarietyServiceImpl")
public class OliveVarietyServiceImpl implements OliveVarietyService {

	@Autowired
	OliveVarietyRepository oliveVarietyRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<OliveVarietyDto> findAll() {
		List<OliveVariety> oliveVarietyList = oliveVarietyRepository.findAll();
		return oliveVarietyList.stream().map(oli -> modelMapper.map(oli, OliveVarietyDto.class))
				.collect(Collectors.toList());

	}
	
	@Override
	public OliveVarietyDto save(OliveVarietyDto oliveVarietyDto) {
		OliveVariety oliveNew = modelMapper.map(oliveVarietyDto, OliveVariety.class);
		oliveNew = oliveVarietyRepository.save(oliveNew);
		return modelMapper.map(oliveNew, OliveVarietyDto.class);
		
	}

}
