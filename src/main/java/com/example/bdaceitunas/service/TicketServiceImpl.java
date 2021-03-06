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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.bdaceitunas.entity.Ticket;
import com.example.bdaceitunas.repository.TicketRepository;

/**
 * Service to convert from stage tables entities to final tables entities
 */
@Service("ticketServiceImpl")
public class TicketServiceImpl implements TicketService {


  @Autowired
  TicketRepository ticketRepository;
  
  @Override
  public Page<Ticket> findAll(Pageable pag) {
	  Page<Ticket> ticketList = ticketRepository.findAll(pag);
	  return ticketList;
  }

}
