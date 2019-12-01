package armase.anothernight.entities.creatures.enemies;

import armase.anothernight.Handler;
import armase.anothernight.entities.creatures.Creature;
import armase.anothernight.gfx.Animation;
import armase.anothernight.gfx.Assets;

public class Boss extends Creature {

	public Boss() {
		super("Weary Dragon", 25, 100, 17, 15);
		isEnemy = true;

		animIdle = new Animation(animSpeed, Assets.placeholders);
		animAttack = new Animation(animSpeed, Assets.placeholders);
		animDeath = new Animation(animSpeed, Assets.placeholders);
		currentAnim = animIdle;
	}
	
	public Boss(Handler handler) {
		super("Weary Dragon", 25, 100, 17, 15, handler);

		animIdle = new Animation(animSpeed, Assets.placeholders);
		animAttack = new Animation(animSpeed, Assets.placeholders);
		animDeath = new Animation(animSpeed, Assets.placeholders);
		currentAnim = animIdle;
	}
}
