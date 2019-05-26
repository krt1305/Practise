package JackSonExceptions;

public class UserWithPrivateFields {

     int id;
     String name;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public UserWithPrivateFields(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
