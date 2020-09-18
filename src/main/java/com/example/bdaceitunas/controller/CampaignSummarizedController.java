
package com.example.bdaceitunas.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdaceitunas.dto.CampaignSummarizedDto;
import com.example.bdaceitunas.service.CampaignSummarizedServiceImpl;

import io.swagger.annotations.ApiOperation;

/**
 * @author mjmuniz
 *
 */
@RestController
@RequestMapping("campaignsSummarized")
public class CampaignSummarizedController {

	@Autowired
	CampaignSummarizedServiceImpl campaignSummarizedServiceImpl;

	@RequestMapping(value="/all",method = RequestMethod.GET)
	public Collection<CampaignSummarizedDto> getCampaignSummarized() {
		return campaignSummarizedServiceImpl.getCampaignSummarized();
	}

	@RequestMapping(value="/byTicketOwner/{id}",method = RequestMethod.GET)
	@ApiOperation(value = "Get a projection model by OwnerParcel", response = CampaignSummarizedDto.class)
	public Collection<CampaignSummarizedDto> getCampaignSummarizedByTicketOwner(@PathVariable("id") Long campaignId) {
		return campaignSummarizedServiceImpl.getCampaignSummarizedByTicketOwner(campaignId);
	}

}
