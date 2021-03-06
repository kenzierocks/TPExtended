package k.tp.executors;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Explosion extends BaseCE {

	@Override
	void preTeleport(Player sp, Location strike1, Location strike2, boolean p2p) {
		sp.getWorld().createExplosion(strike1.getX(), strike1.getY(),
				strike1.getZ(), 0F, false, false);
	}

	@Override
	void postTeleport(Player sp, String teleString, Location strike1,
			Location strike2, boolean p2p, boolean didTele) {
		if (!didTele) {
			return;
		}
		sp.getWorld().createExplosion(strike2.getX(), strike2.getY(),
				strike2.getZ(), 0F, false, false);
		sp.sendMessage("Teleported you to " + teleString
				+ " with an explosion!");
	}

}
