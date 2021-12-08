package Concrete;

import Entities.Player;
import Abstract.PlayerCheckService;

public class PlayerCheckManager implements PlayerCheckService{
	@Override
	public boolean CheckIfRealPlayer(Player player) {
		return false;
	}
}
