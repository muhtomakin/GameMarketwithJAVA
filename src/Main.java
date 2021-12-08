/*This project show to simulation of game project that provides to recording, deleting and updating of player's informations.
 * And also can verify player's informations via Mernis.
 * This project inculudes selling. These sells connects to players directly.  
 * Campaign and integration of campaign into sells.
 */

import java.rmi.RemoteException;
import Abstract.PlayerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		//Player add
		Player player1 = new Player(1, "Muhammed", "Tomakin", "1234567890", 1995);
		//Game add
		Game game1 = new Game(1, "Battlefield 2042", 400);
		//Campaign add
		Campaign campaign1 = new Campaign(1, "Black Friday", 15);
		
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.Add(player1);			
		
		
		GameManager gameManager = new GameManager();
		gameManager.Add(game1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
		
		PlayerCheckService playerCheckService = new MernisServiceAdapter(); 

		
		GameSaleManager gameSaleManager = new GameSaleManager();
		if( playerCheckService.CheckIfRealPlayer(player1) == true) {
		gameSaleManager.Sell(player1, game1, campaign1);
		}else {
			System.out.println("Player cannot be verified. Therefore process failed.");
		}
			

	}

}
