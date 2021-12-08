package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{
	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName() + " is added to the system.");
	}
	
	@Override
	public void Delete(Game game) {
		System.out.println(game.getGameName() + " is deleteded from the system.");
	}
	
	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() + " is updated.");
	}
	
}
