package com.example.bdaceitunas.service;

import com.example.bdaceitunas.dto.CampaignSummarizedDto;
import java.util.List;

public interface CampaignSummarizedService {

	List<CampaignSummarizedDto> getCampaignSummarized();

	List<CampaignSummarizedDto> getCampaignSummarizedByTicketOwner(Long campaignId);
}
