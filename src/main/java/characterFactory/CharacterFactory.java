package characterFactory;

import config.Config;
import heroes.*;
import heroes.Character;

import java.util.HashMap;

public class CharacterFactory {
    public HashMap<Integer, Class<? extends Character>> hm;

    public CharacterFactory() {
        hm = new HashMap<>();
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, Knight.class);
        hm.put(3, King.class);
    }

    //    не свіч!!!!!!!!!! юзни рефлекшинс
    public Character createCharacter() throws IllegalAccessException, InstantiationException {
        return hm.get(Config.random.nextInt(hm.size())).newInstance();
    }
}
