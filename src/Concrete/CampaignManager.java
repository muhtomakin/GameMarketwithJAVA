package Concrete;

import Entities.Campaign;
import Abstract.CampaignService;

public class CampaignManager implements CampaignService{
	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is added to the system.");
	}
	
	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is deleteded from the system.");
	}
	
	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is updated.");
	}
	
}
