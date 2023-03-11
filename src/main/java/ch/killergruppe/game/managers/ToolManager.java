package ch.killergruppe.game.managers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ToolManager {
    private static final Random RNG =  new Random();
    private List<String> ToolList = new ArrayList<>();

    public ToolManager(){
        ToolList.addAll(Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8")
        );
    }

    public String obtainTool(){
        int avatarIndex = RNG.nextInt(ToolList.size() - 1);
        return ToolList.remove(avatarIndex);
    }
}
