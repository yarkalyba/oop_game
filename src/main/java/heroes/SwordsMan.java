package heroes;

import config.Config;
import kickbehav.Behavior;
import kickbehav.RandomBehavior;

public class SwordsMan extends Character {
    public SwordsMan(int min, int max) {
        super(Config.random.nextInt(max - min + 1) + min, Config.random.nextInt(max - min + 1) + min);
        setBehavior(new RandomBehavior());
    }

    public void kick(Character c) {
        Behavior behavior = getBehavior();
        behavior.kick(this, c);
    }
}
