package ch.killergruppe.game.managers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AvatarManager {
    private static final Random RNG =  new Random();
    private List<String> avatarList = new ArrayList<>();

    public AvatarManager(){
        avatarList.addAll(Arrays.asList(
                "Reverend Green",
                "Colonel Mustard",
                "Miss Scarlet",
                "Colonel Mustard",
                "Mrs. white",
                "Mrs. Peacock",
                "Prof. Plum")
        );
    }

    public String obtainAvatar(){
        int avatarIndex = RNG.nextInt(avatarList.size() - 1);
        return avatarList.remove(avatarIndex);
    }
}