package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Freshman3 {
    private String name;

    // Option 1: Autowiring by type
    @Autowired
    @Qualifier("roomA") // Uncomment this for Option 2
    private DormRoom3 room;

    public Freshman3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getRoom() {
        System.out.println(name + " is assigned to: " + room.getLocation());
    }
}
