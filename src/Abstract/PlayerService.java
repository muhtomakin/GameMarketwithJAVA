package Abstract;
import java.rmi.RemoteException;
import Entities.Player;

public interface PlayerService {
	void Add(Player player) throws NumberFormatException, RemoteException;
	void Delete(Player player);
	void Update(Player player);
}
