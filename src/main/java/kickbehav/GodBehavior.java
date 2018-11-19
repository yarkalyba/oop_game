package kickbehav;

import config.Config;
import heroes.Character;

public class GodBehavior implements Behavior {
    public void kick(Character main, Character enemy) {
        enemy.setHp(0);
    }
}
