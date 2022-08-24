package ch.killergruppe.game.assets;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private final String tool;
    private Person kill;
    private String avatar;

    public Person(String avatar, String tool) {
        this.avatar = avatar;
        this.tool = tool;
    }

    public void assignKill(Person kill){
        this.kill = kill;
    }

    public Map<String,String> die(){
        //TODO replace Map with sensible alternative
        Map<String,String> assets = new HashMap<>();
        assets.put(tool, avatar);
        return assets;
    }

}



