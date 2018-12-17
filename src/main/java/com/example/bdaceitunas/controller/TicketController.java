
package com.example.bdaceitunas.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdaceitunas.dto.TicketDto;
import com.example.bdaceitunas.entity.Ticket;
import com.example.bdaceitunas.service.TicketServiceImpl;

/**
 * @author mjmuniz
 *
 */
@RestController
public class TicketController {
	
	
	@Autowired
	TicketServiceImpl ticketServiceImpl;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	
	@RequestMapping(value="/tickets/all",method = RequestMethod.GET)
    @ResponseBody
	public Page<TicketDto> findAll(Pageable pageable) {
		
		Page<Ticket> ticketList = ticketServiceImpl.findAll(pageable);
		List<TicketDto> ticketDtoList = new ArrayList<TicketDto>();
		for (Ticket ticket : ticketList) {
			ticketDtoList.add(convertToDto(ticket));
		}
		//List<TicketDto> ticketDtoList = ticketList.stream().map(ticket -> convertToDto(ticket)).collect(Collectors.toList());
		
		return new PageImpl<TicketDto>(ticketDtoList,pageable,ticketList.getTotalElements());

	}
	
	
	private TicketDto convertToDto(Ticket ticket) {
	    TicketDto ticketDto = modelMapper.map(ticket, TicketDto.class);
	    return ticketDto;
	}
	

}
