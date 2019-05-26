package JackSonExceptions;

import org.testng.annotations.Test;

public class User {

    public int id;
    public String name;

    //no default constructor

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


