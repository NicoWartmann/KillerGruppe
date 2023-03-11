package ch.killergruppe.game;

import ch.killergruppe.game.assets.Person;
import ch.killergruppe.game.managers.AvatarManager;
import ch.killergruppe.game.managers.PeopleManager;
import ch.killergruppe.game.managers.ToolManager;

import java.util.List;

public class Game {
    private static final PeopleManager PEOPLE_MANAGER = new PeopleManager();
    private static final AvatarManager AVATAR_MANAGER = new AvatarManager();
    private static final ToolManager TOOL_MANAGER = new ToolManager();

    public Game(){
    }

    public void gameSetup() {
        for (int i = 0; i < obtainNumberOfPlayers(); i++){
            PEOPLE_MANAGER.addPerson(new Person(AVATAR_MANAGER.obtainAvatar(),TOOL_MANAGER.obtainTool()));
        }

        List<Person> killList = PEOPLE_MANAGER.getKillListInOrder();
        Person nextKill = killList.get(killList.size() - 1);
        for (Person person : PEOPLE_MANAGER.getKillListRandomized()) {
            person.assignKill(nextKill);
            nextKill = person;
        }
        //Debug Breakpoint
        int i = 1;
    }

    private int obtainNumberOfPlayers() {
        //TODO Terminal Abfrage anz. Spieler
        return 4;
    }

}
