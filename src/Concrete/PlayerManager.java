package Concrete;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService){
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void Add(Player player) throws NumberFormatException, RemoteException {
		if(playerCheckService.CheckIfRealPlayer(player)) {
			System.out.println(player.getFirstName() + " player is added to the system.");
		}else {
			System.out.println("Wrong player input!");
			Delete(player);
		}
		
	}

	@Override
	public void Delete(Player player) {
		System.out.println(player.getFirstName() + " player is deleted from the system.");
	}

	@Override
	public void Update(Player player) {
		System.out.println(player.getFirstName() + " player is updated.");
		
	}
	
	
}
