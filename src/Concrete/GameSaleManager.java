package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService{

	@Override
	public void Sell(Player player, Game game, Campaign campaign) {
		double price = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignDiscount()/100);
		
		System.out.println(" Player " + player.getFirstName() + " bought the " + game.getGameName() + game.getGamePrice() + " with the discount that " 
				+ campaign.getCampaignName() + ", " + campaign.getCampaignDiscount() + ".");
		
	}
	
}
