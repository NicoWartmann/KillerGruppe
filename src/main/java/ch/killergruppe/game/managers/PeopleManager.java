package ch.killergruppe.game.managers;

import ch.killergruppe.game.assets.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeopleManager {
    private List<Person> killList;

    public PeopleManager() {
        killList = new ArrayList<>();
    }

    public void addPerson(Person person){
        killList.add(person);
    }

    public Map<String, String> killPerson(Person victim){
        return victim.die();
    }

    public List<Person> getKillListInOrder(){
        return killList;
    }

    public List<Person> getKillListRandomized(){
        //TODO Randomization - now it's only a shifted List
        List<Person> randomizedKillList = killList;
        killList.add(killList.remove(0));
        return randomizedKillList;
    }

    public Person obtainFirstKill(){
        //TODO
        return null;
    }

}
