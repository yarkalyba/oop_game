package heroes;


import kickbehav.Behavior;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Random;

@ToString

public abstract class Character {

    @Getter
    @Setter
    private int power;

    @Getter
    private int hp;

    @Getter
    @Setter
    private Behavior behavior;


    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int power) {
        if (power < 0) {
            this.power = 0;
        }
        this.power += power;
    }
}
