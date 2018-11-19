package kickbehav;
import config.Config;
import heroes.Character;

public class RandomBehavior implements Behavior {
    public void kick(Character main,Character enemy){
        enemy.setHp(enemy.getHp() - Config.random.nextInt(main.getPower() + 1));
    }
}
