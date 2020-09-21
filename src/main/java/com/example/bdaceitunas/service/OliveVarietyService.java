package com.example.bdaceitunas.service;

import com.example.bdaceitunas.dto.OliveVarietyDto;
import java.util.List;

public interface OliveVarietyService {

	List<OliveVarietyDto> findAll();

	OliveVarietyDto save(OliveVarietyDto oliveVarietyDto);
}
